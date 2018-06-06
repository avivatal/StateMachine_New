public class CanTakeTestState implements IExamState {

    @Override
    public void entry() {
        System.out.printf("enter CanTakeTest state\n");
    }

    @Override
    public void takeExam(double grade, MainContext context) {
        if(grade < 56){
            context.setExamState(new FailedState());
        }
        else if(grade >= 90){
            context.setExamState(new PassedWithExcellencyState());
        }
        else {
            context.setExamState(new PassedState());
        }
    }

    @Override
    public void readArticle(MainContext context) {
    }

    @Override
    public String status(String input) {
        return input;
    }
}
