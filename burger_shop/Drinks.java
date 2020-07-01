package burger_shop;

public class Drinks {
    private String name;

    static final String water = "water";
    static final String gatorade = "Gatorade";
    static final String coke = "Coke";
    static final String sprite = "Sprite";
    static final String drPepper = "Dr. Pepper";
    static final String sweetTea = "sweet tea";
    static final String dietCoke = "Diet Coke";
    static final double drinkPrice = 2.19;

    public Drinks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getWater() {
        return water;
    }

    public static String getGatorade() {
        return gatorade;
    }

    public static String getCoke() {
        return coke;
    }

    public static String getSprite() {
        return sprite;
    }

    public static String getDrPepper() {
        return drPepper;
    }

    public static String getSweetTea() {
        return sweetTea;
    }

    public static String getDietCoke() {
        return dietCoke;
    }

    public static double getDrinkPrice() {
        return drinkPrice;
    }
}
