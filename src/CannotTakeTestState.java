public class CannotTakeTestState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter CannotTakeTest state\n");
    }

    @Override
    public void takeExam(double grade, MainContext context) {
    }

    @Override
    public void readArticle(MainContext context) {
        context.setExamState(new CanTakeTestState());
    }

    @Override
    public String status(String input) {
        return input;
    }
}
