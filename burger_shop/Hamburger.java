package burger_shop;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String topping1Name;
    private double topping1Price;

    private String topping2Name;
    private double topping2Price;

    private String topping3Name;
    private double topping3Price;

    private String topping4Name;
    private double topping4Price;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addTopping1(String name, double price) {
        this.topping1Name = name;
        this.topping1Price = price;
    }

    public void addTopping2(String name, double price) {
        this.topping2Name = name;
        this.topping2Price = price;
    }
    public void addTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
    }
    public void addTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on " + this.breadType
                + " with " + this.meat + ", and the price is "  + this.price);
        if(this.topping1Name != null) {
            hamburgerPrice += this.topping1Price;
            System.out.println("     Added " + this.topping1Name + " for an extra " + this.topping1Price);
        }
        if(this.topping2Name != null) {
            hamburgerPrice += this.topping2Price;
            System.out.println("     Added " + this.topping2Name + " for an extra " + this.topping2Price);
        }
        if(this.topping3Name != null) {
            hamburgerPrice += this.topping3Price;
            System.out.println("     Added " + this.topping3Name + " for an extra " + this.topping3Price);
        }
        if(this.topping4Name != null) {
            hamburgerPrice += this.topping4Price;
            System.out.println("     Added " + this.topping4Name + " for an extra " + this.topping4Price);
        }
        return hamburgerPrice;
    }


}
