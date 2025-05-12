
public class multithreading {


    public static void main(String[] args) {
        // we can make a class implements the Runnable interface

        for (int i = 0; i < 10000; i++) {
            Thread t1 = new Thread(new Runnable() {
                public void run() {
                    Semaphore_Singleton singleton = Semaphore_Singleton.getInstance();

                }
            });

            t1.start();
        }


    }
}
