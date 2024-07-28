public class Singleton_With_Sync {

    private static Singleton_With_Sync instance;
    private Singleton_With_Sync() {
        // Some init
    }
    public static Singleton_With_Sync getInstance() {
    // here we solve the problem of two or more threads want to instance  , but we add some more time for sync

        synchronized (Singleton_With_Sync.class) {
            if (instance == null) {
                instance = new Singleton_With_Sync();
            }
//
        }
        return instance;
    }


}
