import java.util.concurrent.Semaphore;

public class Semaphore_Singleton {

    private static Semaphore_Singleton semaphore_singleton ;
    static Semaphore semaphore=new Semaphore(1);
//    private static boolean lock = false;

    Semaphore_Singleton() {
        System.out.println("Semaphore_Singleton is created ");
    }

    public static Semaphore_Singleton getInstance()  {
        semaphore.acquireUninterruptibly();
//        while (lock){
//
//        }
//
//        lock = true;
        if (semaphore_singleton == null) {
            semaphore_singleton = new Semaphore_Singleton();
        }
//        lock = false;
        semaphore.release();
        return semaphore_singleton;
    }
}
