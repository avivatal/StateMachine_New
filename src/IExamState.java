public interface IExamState {

    public void entry();

    public void takeExam(double grade, MainContext context);

    public void readArticle(MainContext context);

    public String status(String input);
}
