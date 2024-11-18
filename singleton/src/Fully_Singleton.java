public class Fully_Singleton {
    private static volatile Fully_Singleton instance;
    // hen we add volatile key word mean will this variable read from memory directly and another thread
    // will not be allowed to crash the program
    private Fully_Singleton() {

        //some initialization
    }

    public static Fully_Singleton getInstance() {
    //but when use volatile there will read from memory each time so will improve it by take the result and store it in variable
    Fully_Singleton result = instance;
        if (result == null) {
            synchronized (Fully_Singleton.class) {
                result = instance;
                if (result == null) {
                    result=instance = new Fully_Singleton();

                }
            }
        }
        return result;
    }
//
}
