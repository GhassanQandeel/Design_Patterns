public class Main {
    public static void main(String[] args) {





    Singleton singleton=Singleton.getInstance(0.5);
    Singleton singleton2=Singleton.getInstance(1.5);

    System.out.println(singleton.calcexchange(5));

    System.out.println(singleton2.calcexchange(4));

    }
}


