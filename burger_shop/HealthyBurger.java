package burger_shop;

public class HealthyBurger extends burger_shop.Burger {
    private String healthyToppingName1;
    private double healthyToppingPrice1;

    private String healthyToppingName2;
    private double healthyToppingPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "wheat bun");
    }

    public void healthyTopping1(String name, double price) {
        this.healthyToppingName1 = name;
        this.healthyToppingPrice1 = price;
    }
    public void healthyTopping2(String name, double price) {
        this.healthyToppingName2 = name;
        this.healthyToppingPrice2 = price;
    }

    @Override
    public double itemize() {
        double burgerPrice = super.itemize();
        if (this.healthyToppingName1 != null) {
            burgerPrice += this.healthyToppingPrice1;
            System.out.println("Added " + this.healthyToppingName1 + " for an extra " + this.healthyToppingPrice1);
        }
        if (this.healthyToppingName2 != null) {
            burgerPrice += this.healthyToppingPrice2;
            System.out.println("Added " + this.healthyToppingName2 + " for an extra " + this.healthyToppingPrice2);
        }
        return burgerPrice;
    }
}
