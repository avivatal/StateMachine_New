public class MainContext {

    IExamState examState;
    IQuizState quizState;
    IArticlesState articlesState;
    IForumState forumState;
    int weekCounter;
    int posts;
    int articles;
    int points;

    public MainContext(){
        examState = new CannotTakeTestState();
        examState.entry();
        quizState = new DidntAnswerQuizState();
        quizState.entry();
        articlesState = new RegularState();
        articlesState.entry();
        forumState = new PassiveState();
        forumState.entry();
        weekCounter = 0;
        posts = 0;
        articles = 0;
        points = 0;
    }

    public void event(String input){
        String[] splited = input.split(" ");
        switch (splited[0].substring(1)) {
            case "read":
                articlesState.readArticle(this);
                examState.readArticle(this);
                break;
            case "post":
                forumState.postInForum(this);
                break;
            case "answer":
                quizState.answerQuiz(this);
                break;
            case "next_week":
                weekCounter++;
                forumState.nextWeek(this);
                quizState.nextWeek(this);
                break;
            case "exam":
                if(splited.length > 1){
                    examState.takeExam(Double.parseDouble(splited[1]), this);
                }
                break;
            case "status":
                if(splited.length == 1){
                    System.out.printf("No params given\n");
                }
                else {
                    String output = splited[1];
                    output = articlesState.status(output);
                    output = forumState.status(output);
                    output = examState.status(output);
                    System.out.printf(output+"\n");
                }
                break;
        }
    }

    public void setPosts() {
        posts++;
    }

    public void setArticles() {
        articles++;
    }

    public void zeroPosts(){
        posts = 0;
    }

    public void setPoints() {
        points++;
    }

    public void setExamState(IExamState examState) {
        this.examState = examState;
        examState.entry();
    }

    public void setQuizState(IQuizState quizState) {
        this.quizState = quizState;
        quizState.entry();
    }

    public void setArticlesState(IArticlesState articlesState) {
        this.articlesState = articlesState;
        articlesState.entry();
    }

    public void setForumState(IForumState forumState) {
        this.forumState = forumState;
        forumState.entry();
    }

    public int getWeekCounter() {
        return weekCounter;
    }

    public int getPosts() {
        return posts;
    }

    public int getArticles() {
        return articles;
    }

    public int getPoints() {
        return points;
    }
}
