public class Singleton_DoublyCheck {

    private static Singleton_DoublyCheck instance;
    private Singleton_DoublyCheck() {

        //some code ;

    }
    public static Singleton_DoublyCheck getInstance() {
        /*here we solve the problem of take more time for non first instance it take more time but we have a new problem
        * where we there to thread or more the data memory where first instance got to initilaized will be update the data
        * memory and take another thread the null and program will be crush so we will solve it . */
        if (instance == null)
            synchronized (Singleton_DoublyCheck.class) {
                if (instance == null)
                    instance = new Singleton_DoublyCheck();
            }

        return instance;
    }
}
