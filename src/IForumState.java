public interface IForumState {

    public void entry();

    public void postInForum(MainContext context);

    public void nextWeek(MainContext context);

    public String status(String input);
}
