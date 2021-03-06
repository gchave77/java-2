package burger_shop;

public class Order {
    private String name;
    private String bread;
    private String meat;
    private double price;
    private String meal;

    public Order(String name, String bread, String meat, double price) {
        this.name = name;
        this.bread = bread;
        this.meat = meat;
        this.price = price;
    }

    public Order(String meal) {
        this.meal = meal;
    }

    private String toppingName1;
    private double toppingPrice1;

    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;

    private String toppingName4;
    private double toppingPrice4;

    private String side1;
    private double sidePrice1;

    private String side2;
    private double sidePrice2;

    private String side3;
    private double sidePrice3;

    private String drink;
    private double drinkPrice;

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

    public void side1(String name, double price) {
        this.side1 = name;
        this.sidePrice1 = price;
    }
    public void side2(String name, double price) {
        this.side2 = name;
        this.sidePrice2 = price;
    }
    public void side3(String name, double price) {
        this.side3 = name;
        this.sidePrice3 = price;
    }

    public void drink(String name, double price) {
        this.drink = name;
        this.drinkPrice = price;
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

        if (this.side1 != null) {
            burgerPrice += this.sidePrice1;
            System.out.println("Added " + this.side1 + " for an extra " + this.sidePrice1);
        }
        if (this.side2 != null) {
            burgerPrice += this.sidePrice2;
            System.out.println("Added " + this.side2 + " for an extra " + this.sidePrice2);
        }
        if (this.side3 != null) {
            burgerPrice += this.sidePrice3;
            System.out.println("Added " + this.side3 + " for an extra " + this.sidePrice3);
        }

        if (this.drink != null) {
            burgerPrice += this.drinkPrice;
            System.out.println("Added " + this.drink + " for an extra " + this.drinkPrice);
        }

        return burgerPrice;
    }


}
