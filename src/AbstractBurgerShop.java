abstract class Burger2 {
    String meat;
    boolean cheese;
    double price; // Changed to double for decimal prices

    Burger2(String meat, boolean cheese, double price) {
        this.meat = meat;
        this.cheese = cheese;
        this.price = price;
    }

    public abstract String getName(); // Abstract method to get the name of the burger

    public abstract double getPrice(); // Abstract method to get the price of the burger

    public abstract void makeBurger();
}

class ZingerBurger2 extends Burger2 {
    boolean zingerPrice;

    ZingerBurger2(String meat, boolean cheese, double price, boolean zingerPrice) {
        super(meat, cheese, price);
        this.zingerPrice = zingerPrice;
    }

    @Override
    public String getName() {
        return "Zinger Burger";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void makeBurger() {
        System.out.println("Method of creating Zinger Burger by ZingerBurger class");
    }
}

class BeefBurger2 extends Burger2 {
    boolean pickles;

    BeefBurger2(String meat, boolean cheese, short price, boolean pickles) {
        super(meat, cheese, price);
        this.pickles = pickles;
    }

    @Override
    public String getName() {
        return "Beef Burger";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void makeBurger() {
        System.out.println("Method of creating Beef Burger by BeefBurger class");
    }
}

public class AbstractBurgerShop {
    public static void main(String[] args) {

        Burger2 zingerBurger = new ZingerBurger2("chicken", true, (short)9, true);
        Burger2 beefBurger = new BeefBurger2("beef", true, (short)10, false);
        System.out.println("BURGER MENU:");
        displayBurgerInfo(zingerBurger);
        displayBurgerInfo(beefBurger);
    }

    public static void displayBurgerInfo(Burger2 burger2) {
        //System.out.println(burger2.getName() + ": $" + burger2.getPrice());
        System.out.println(" Burger Name :  "+ burger2.getName()+" \t "
                + burger2.getName()+" Price :"+ burger2.getPrice());
        burger2.makeBurger(); // Run-time polymorphism
    }
}