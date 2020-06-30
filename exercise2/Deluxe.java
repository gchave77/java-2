package burger_shop;

public class Deluxe extends burger_shop.Burger {
    private String sideName1 = "chips";
    private double sidePrice1 = 1.62;

    private String sideName2 = "soda";
    private double sidePrice2 = 1.51;

    public Deluxe(String name, String meat, double price, String bread) {
        super(name, meat, price, bread);
    }

//    public void Deluxe(String name, String meat, double price, String bread, String sideName1, double sidePrice1, String sideName2, String sidePrice2) {
    public void Deluxe() {
//        super(name, meat, price, bread);
        this.sideName1 = sideName1;
        this.sidePrice1 = sidePrice1;
        this.sideName2 = sideName2;
        this.sidePrice2 = sidePrice2;
    }

    @Override
    public double itemize() {
        double deluxePrice = super.itemize();
        deluxePrice += this.sidePrice1;
        System.out.println("Added " + this.sideName1 + " for an extra " + this.sidePrice1);
        deluxePrice += this.sidePrice2;
        System.out.println("Added " + this.sideName2 + " for an extra " + this.sidePrice2);

        return deluxePrice;
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
