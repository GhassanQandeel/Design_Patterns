import java.nio.ReadOnlyBufferException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton_With_Lock {
    private static Singleton_With_Lock instance;
    private static Lock lock = new ReentrantLock();

    private Singleton_With_Lock() {
        System.out.println("Singleton_With_Lock is created ");
    }
    public static Singleton_With_Lock getInstance() {
        lock.lock();
            if (instance == null) {
                instance = new Singleton_With_Lock();
            }
        lock.unlock();
            return instance;

        }
}
