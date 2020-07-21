package burger_shop;

public class Side {
    private String sideName = "chips & soda";
    private double sidePrice = 2.50;

    public Side(String sideName, double sidePrice) {
        this.sideName = sideName;
        this.sidePrice = sidePrice;
    }

    public String getSideName() {
        return this.sideName;
    }

    public double getSidePrice() {
        return this.sidePrice;
    }

}
