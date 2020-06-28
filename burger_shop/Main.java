package burger_shop;

public class Main {

    public static void main(String[] args) {
        burger_shop.Burger burger = new burger_shop.Burger("Regular", "hamburger", 3.26, "white bun");
        System.out.println("Total price is " + burger.itemize());
        System.out.println(" ");

        burger.addTopping1("tomato", .25);
        burger.addTopping2("lettuce", .25);
        burger.addTopping3("pickles", .25);
        burger.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger.itemize());
        System.out.println(" ");

        burger_shop.HealthyBurger healthyBurger = new
                burger_shop.HealthyBurger("turkey", 4.26);
        healthyBurger.healthyTopping1("egg", 2.50);
        healthyBurger.healthyTopping2("avocado", 1.50);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemize());

    }


}
