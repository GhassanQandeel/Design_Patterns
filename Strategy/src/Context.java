public class Context  {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;

    }
    String executeStrategy() {
        return Strategy.gotoby();
    }

}
