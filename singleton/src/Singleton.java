/*for learning :
    Singleton

    Problem :
    The problem is we need to protect the data from developers in generally or can say we need to read a large
    data from Database (Large traffic when use it more than one time )

    Used for  :
    initialization some data frequently to change (configuration the application)


*/
public class Singleton {
    
    private static Singleton instance;
    String name  ;
    int age ;

    private Singleton() {
        /*
         we can do like configuration or initialize something will not change or uniquely change
         where will instance one time
        */
        name ="Ghassan";
        age =20; // age change early be careful ^_^
    }
    
    public static Singleton getInstance() {
        if (instance == null) {

            instance = new Singleton();

        }
        return instance;
    }

    public static void print_something(){

        System.out.println("hi There ");

    }
    
    
}
