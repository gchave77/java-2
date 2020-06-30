package burger_shop;

public class Meal extends burger_shop.Burger {
    private String[] drink = { "water", "gatorade", "coke", "sprite", "dr. pepper", "sweet tea", "diet coke" };
    private double drinkPrice = 2.51;
    private String[] side = { "fries", "chips", "apple pie", "ice cream", "fried pickles" };
    private double sidePrice = 2.51;

    public Meal(String name, String meat, double price, String bread, String[] drink, double drinkPrice, String[] side,
            double sidePrice) {
        super(name, meat, price, bread);
        this.drink = drink;
        this.drinkPrice = drinkPrice;
        this.side = side;
        this.sidePrice = sidePrice;
    }

    public String[] getDrink() {
        return drink;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public String[] getSide() {
        return side;
    }

    public double getSidePrice() {
        return sidePrice;
    }
}
