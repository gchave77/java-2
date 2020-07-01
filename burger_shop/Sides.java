package burger_shop;

public class Sides {
    private String name;

    final String fries = "fries";
    static final String chips = "chips";
    static final String applePie = "apple pie";
    static final String iceCream = "ice cream";
    static final String friedPickles = "fried pickles";
    static final double sidePrice = 2.51;

    public Sides(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFries() {
        return fries;
    }

    public static String getChips() {
        return chips;
    }

    public static String getApplePie() {
        return applePie;
    }

    public static String getIceCream() {
        return iceCream;
    }

    public static String getFriedPickles() {
        return friedPickles;
    }

    public static double getSidePrice() {
        return sidePrice;
    }
}
