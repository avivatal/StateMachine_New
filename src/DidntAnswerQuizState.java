public class DidntAnswerQuizState implements IQuizState {

    @Override
    public void entry() {
        System.out.printf("enter DidntAnswerQuiz state\n");
    }

    @Override
    public void answerQuiz(MainContext context) {
        if(context.getWeekCounter() < 13) {
            context.setPoints();
            context.setQuizState(new AnsweredQuizState());
        }
    }

    @Override
    public void nextWeek(MainContext context) {

    }
}
