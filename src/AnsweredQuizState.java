public class AnsweredQuizState implements IQuizState {

    @Override
    public void entry() {
        System.out.printf("enter AnsweredQuiz state\n");
    }

    @Override
    public void answerQuiz(MainContext context) {

    }
    @Override
    public void nextWeek(MainContext context){
        context.setQuizState(new DidntAnswerQuizState());
    }
}
