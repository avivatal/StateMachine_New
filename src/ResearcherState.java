public class ResearcherState implements IArticlesState {

    @Override
    public void readArticle(MainContext context) {
        context.setArticles();
    }

    @Override
    public String status(String input) {
        return "**" + input + "**";
    }

    @Override
    public void entry() {
        System.out.printf("enter Researcher state\n");
    }
}
