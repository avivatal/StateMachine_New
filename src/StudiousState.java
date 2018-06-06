public class StudiousState implements IArticlesState {

    @Override
    public void readArticle(MainContext context) {
        context.setArticles();
        if(context.getArticles() == 8){
            context.setArticlesState(new ResearcherState());
        }
    }

    @Override
    public void entry() {
        System.out.printf("enter Studious state\n");
    }


    @Override
    public String status(String input) {
        return "*" + input + "*";
    }
}
