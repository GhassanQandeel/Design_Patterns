public class Main {
    public static void main(String[] args){

        Context context;

        context=new Context(new ConcerateStrategyDriving());

        System.out.println(context.executeStrategy());
    }

}