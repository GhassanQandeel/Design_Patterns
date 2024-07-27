/*for learning :
    Singleton

    Problem :
    The problem is we need to protect the data from developers in generally or can say we need to read a large
    data from Database (Large traffic when use it more than one time )

    Used for  :
    initialization some data frequently to change (configuration the application)


*/

/*
*  suppose the values of exchange is fixed for long time
*  we store it in somewhere the time for call and store this details is large very large
*  and this data is sensitive, so we will try to control data access .
*  so we will use  singleton where is less the traffic of call the data to the program
*  and allow to control the data .
*/


public class Singleton {
    
    private static Singleton instance;

    private static  double exchangefactor ;

    private  Singleton(double factor) {
        /*
         we can do like configuration or initialize something will not change or uniquely change
         where will instance one time
        */
        // we suppose this is a huge data traffic
            exchangefactor = factor ;


    }
    
    public static Singleton getInstance(double factor) {

        if (instance == null) {

            instance = new Singleton(factor);

        }
        return instance;
    }

    public static double calcexchange(double basevalue){

        return basevalue * exchangefactor ;

    }
    
    
}
