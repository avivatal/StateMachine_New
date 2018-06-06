public class RegularState implements IArticlesState {

    @Override
    public void readArticle(MainContext context) {
        context.setArticles();
        if(context.getArticles() == 3){
            context.setArticlesState(new StudiousState());
        }
    }

    @Override
    public void entry() {
        System.out.printf("enter Regular state\n");
    }


    @Override
    public String status(String input) {
        return input;
    }
}
