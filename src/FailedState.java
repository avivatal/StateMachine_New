public class FailedState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter Failed state\n");
    }

    @Override
    public void takeExam(double grade, MainContext context) {

    }

    @Override
    public void readArticle(MainContext context) {

    }

    @Override
    public String status(String input) {
        return input;
    }
}
