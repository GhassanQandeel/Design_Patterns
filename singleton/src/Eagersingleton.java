public class Eagersingleton {
    private static final Eagersingleton  instance = new Eagersingleton();
    private Eagersingleton() {
        System.out.println("Eager singleton is created");
    }
    public static Eagersingleton getInstance() {
        return instance;
    }
}
