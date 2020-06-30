package burger_shop;

public class Meat {
    private String name;

    static final String beef = "Beef";
    static final String chicken = ("Chicken");
    static final String turkey = ("Turkey");
    static final String brisket = ("Brisket");

    public Meat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}