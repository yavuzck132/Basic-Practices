public class Deluxe extends Burger {

    public Deluxe(String bread, String meat) {
        super(bread, meat, 0);
    }

    @Override
    public void getTotalPrice(){
        addMeatPrice();
        this.price += 4;
        System.out.println("Your total amount of payment is " + this.price);
    }
}
