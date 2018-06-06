public class ActiveState implements IForumState {

    @Override
    public void entry() {
        System.out.printf("enter Active state\n");
    }

    @Override
    public void postInForum(MainContext context) {
        context.setPosts();
    }

    @Override
    public void nextWeek(MainContext context) {
        context.zeroPosts();
        context.setForumState(new PassiveState());
    }

    @Override
    public String status(String input) {
        return input + "(active)";
    }
}