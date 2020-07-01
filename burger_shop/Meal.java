package burger_shop;

public class Meal extends burger_shop.Burger {
    private String drink;
    private double drinkPrice;
    private String side;
    private double sidePrice;

    public Meal(String name, String meat, double price, String bread, String drink, double drinkPrice, String side, double sidePrice) {
        super(name, meat, price, bread);
        this.drink = drink;
        this.drinkPrice = drinkPrice;
        this.side = side;
        this.sidePrice = sidePrice;
    }

    @Override
    public double itemize() {
        double mealPrice = super.itemize();
        mealPrice += this.drinkPrice;
        System.out.println("Added " + this.drink + " for an extra " + this.drinkPrice);
        mealPrice += this.sidePrice;
        System.out.println("Added " + this.side + " for an extra " + this.sidePrice);
        System.out.println("Toppings: 'lettuce, pickles, tomatoes, onions, ketchup, mustard' are no additional charge.");

        return mealPrice;
    }

}
