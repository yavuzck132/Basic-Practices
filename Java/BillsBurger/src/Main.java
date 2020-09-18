import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       //Assuming that the user knows the content of the choices
       System.out.println("Press a number for the type of burger you would like to have:");
       System.out.println("1: Burger.");
       System.out.println("2: Healthy Burger.");
       System.out.println("3: Deluxe Burger.");

       String bread;
       String meat;
       String choice = scanner.nextLine();

       if(choice.equals("1")){
           System.out.println("Choose bread type you want to have: ");
           bread = scanner.nextLine();
           System.out.println("Choose the type of meat you want to have: ");
           meat = scanner.nextLine();
           Burger order = new Burger(bread, meat, 4);
           order.getTotalPrice();
       }
       else if(choice.equals("2")){
           Burger order = new Healthy("Brown Rye Bread Roll", "chicken", 6);
           order.getTotalPrice();
       }
       else if(choice.equals("3")){
           System.out.println("Choose bread type you want to have: ");
           bread = scanner.nextLine();
           System.out.println("Choose the type of meat you want to have: ");
           meat = scanner.nextLine();
           Burger order = new Deluxe(bread, meat);
           order.getTotalPrice();
       }
       else{
           System.out.println("No choice have been made");
           System.out.println("Order is being cancelled");
           System.out.println("Good Day!");
           return;
       }
   }
}
