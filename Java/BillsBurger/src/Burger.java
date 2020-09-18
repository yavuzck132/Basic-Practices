import java.util.Scanner;

public class Burger {

    public double price = 5.00;
    private String bread;
    private String meat;
    private int additions;
    private char choice;
    Scanner scanner = new Scanner(System.in);


    public Burger(String bread, String meat, int additions) {
        this.bread = bread;
        this.meat = meat;
        this.additions = additions;
    }

    //Assuming the bread prices are the same
    public double addMeatPrice(){
        while(true) {
            this.meat.toLowerCase();
            if (this.meat.equals("beef")) {
                this.price += 4.00;
                break;
            } else if (this.meat.equals("chicken")) {
                this.price += 3.00;
                break;
            }
            else{
                System.out.println("Please make a choice between beef and chicken");
                this.meat = scanner.nextLine();
            }
        }
        return this.price;
    }

    public double addAdditionsPrice(){

        System.out.println("You can make up to " + this.additions + "amount of choices to add to your burger menu. Press 0 to finish up your burger.");
        System.out.println("Press a number from below to choose the add extras.");
        System.out.println("1: Add drinks");
        System.out.println("2: Add fries");
        System.out.println("3: Add chips");
        System.out.println("4: Add cheese to burger");
        System.out.println("Press any other number to stop adding extras to your burger menu.");
        for(int i = 0; i < this.additions; i++){
            this.choice = scanner.next().charAt(0);
            switch (this.choice){
                case '1':
                    System.out.println("You added fries to the side");
                    this.price += 2;
                    break;
                case '2':
                    System.out.println("You added drinks to the side");
                    this.price += 2.5;
                    break;
                case '3':
                    System.out.println("You added chips to the side");
                    this.price += 1.5;
                    break;
                case '4':
                    System.out.println("You added cheese to your burger");
                    this.price += 1;
                    break;
                default:
                    System.out.println("You no longer want to add extra items to your burger menu");
                    i = this.additions;
                    break;
            }

        }
        return this.price;
    }

    public void getTotalPrice(){
        addMeatPrice();
        addAdditionsPrice();
        System.out.println("Your total amount of payment is " + this.price);
    }
}
