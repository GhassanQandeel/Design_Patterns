public class Worker{
    Solutions solution;
     private String input;


    void setSolution(String input){
         this.input = input;
         if (input.equals("Car")){
             solution=new CarTire();
             solution.changeTire();
         }else if (input.equals("Truck")){
             solution=new TruckTire();
             solution.changeTire();

         }
    }
}
