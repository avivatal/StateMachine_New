public class PassiveState implements IForumState {

    @Override
    public void entry() {
        System.out.printf("enter Passive state\n");
    }

    @Override
    public void postInForum(MainContext context) {
        context.setPosts();
        if(context.getPosts() == 2){
            context.setForumState(new ActiveState());
        }
    }

    @Override
    public void nextWeek(MainContext context){
        context.zeroPosts();
    }

    @Override
    public String status(String input) {
        return input;
    }
}
