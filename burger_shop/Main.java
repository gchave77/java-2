package burger_shop;

public class Main {

    public static void main(String[] args) {
        burger_shop.Burger burger = new burger_shop.Burger("Regular", "hamburger", 3.15, "White bun");
        System.out.println("Total price is " + burger.itemize());
        System.out.println(" ");

        burger.addTopping1("tomato", .25);
        burger.addTopping2("lettuce", .25);
        burger.addTopping3("pickles", .25);
        burger.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger.itemize());
        System.out.println(" ");

    }


}
