package burger_shop;

public class Toppings {
    private String name;

    static final String tomato = "tomato";
    static final String lettuce = "lettuce";
    static final String pickles = "pickles";
    static final String onions = "onions";
    static final String mustard = "mustard";
    static final String ketchup = "ketchup";
    static final double price = .15;
    static final String cheese = "cheese";
    static final double cheesePrice = 1.51;
    static final String egg = "egg";
    static final double eggPrice = 2.51;
    static final String avacado = "avacado";
    static final double avacadoPrice = 1.51;

    public Toppings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getTomato() {
        return tomato;
    }

    public static String getLettuce() {
        return lettuce;
    }

    public static String getPickles() {
        return pickles;
    }

    public static String getOnions() {
        return onions;
    }

    public static String getMustard() {
        return mustard;
    }

    public static String getKetchup() {
        return ketchup;
    }

    public static double getPrice() {
        return price;
    }

    public static String getCheese() {
        return cheese;
    }

    public static double getCheesePrice() {
        return cheesePrice;
    }

    public static String getEgg() {
        return egg;
    }

    public static double getEggPrice() {
        return eggPrice;
    }

    public static String getAvacado() {
        return avacado;
    }

    public static double getAvacadoPrice() {
        return avacadoPrice;
    }
}
