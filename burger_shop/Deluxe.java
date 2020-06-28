package burger_shop;

public class Deluxe extends burger_shop.Burger {

    public Deluxe() {
        super("Deluxe", "Sausage", 8.48, "pretzel roll");
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Cannot add items to a Deluxe burger.");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Cannot add items to a Deluxe burger.");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Cannot add items to a Deluxe burger.");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Cannot add items to a Deluxe burger.");
    }

}
