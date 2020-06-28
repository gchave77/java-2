package burger_shop;

public class DeluxeBurger extends burger_shop.Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White bread");
        super.addTopping1("Chips", 2.75);
        super.addTopping2("Drink", 1.81);
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Cannot add additional topping1 to a deluxe burger");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Cannot add additional topping2 to a deluxe burger");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Cannot add additional topping3 to a deluxe burger");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Cannot add additional topping4 to a deluxe burger");
    }
}
