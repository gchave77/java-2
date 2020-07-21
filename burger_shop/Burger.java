package burger_shop;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String bread;

    private String toppingName1;
    private double toppingPrice1;

    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;

    private String toppingName4;
    private double toppingPrice4;

    public Burger(String name, String meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addTopping1(String name, double price) {
        this.toppingName1 = name;
        this.toppingPrice1 = price;
    }
    public void addTopping2(String name, double price) {
        this.toppingName2 = name;
        this.toppingPrice2 = price;
    }
    public void addTopping3(String name, double price) {
        this.toppingName3 = name;
        this.toppingPrice3 = price;
    }
    public void addTopping4(String name, double price) {
        this.toppingName4 = name;
        this.toppingPrice4 = price;
    }

    public double itemize() {
        double burgerPrice = this.price;
        System.out.println(this.name + " burger on " + this.bread + " is " + this.price);
        if (this.toppingName1 != null) {
            burgerPrice += this.toppingPrice1;
            System.out.println("Added " + this.toppingName1 + " for an extra " + this.toppingPrice1);
        }
        if (this.toppingName2 != null) {
            burgerPrice += this.toppingPrice2;
            System.out.println("Added " + this.toppingName2 + " for an extra " + this.toppingPrice2);
        }
        if (this.toppingName3 != null) {
            burgerPrice += this.toppingPrice3;
            System.out.println("Added " + this.toppingName3 + " for an extra " + this.toppingPrice3);
        }
        if (this.toppingName4 != null) {
            burgerPrice += this.toppingPrice4;
            System.out.println("Added " + this.toppingName4 + " for an extra " + this.toppingPrice4);
        }
        return burgerPrice;
    }
}
