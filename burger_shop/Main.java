package burger_shop;

public class Main {

    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        burger_shop.Burger burger1 = new burger_shop.Burger(burger_shop.Meat.beef, burger_shop.Meat.beef, 3.26, burger_shop.Bread.onion);
        burger1.addTopping3("pickles", .25);
        burger1.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger1.itemize());
        System.out.println(" ");

        burger_shop.Burger burger2 = new burger_shop.Burger(burger_shop.Meat.chicken, burger_shop.Meat.chicken, 3.26, burger_shop.Bread.white);
        burger2.addTopping1("tomato", .25);
        burger2.addTopping2("lettuce", .25);
        burger2.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger2.itemize());
        System.out.println(" ");

        burger_shop.HealthyBurger healthy1 = new
                burger_shop.HealthyBurger("Healthy", burger_shop.Meat.turkey, 5.96, burger_shop.Bread.wheat);
        healthy1.healthyTopping1("egg", 2.49);
        healthy1.healthyTopping2("avocado", 1.49);
        System.out.println("Total Healthy burger price is " + healthy1.itemize());
        System.out.println(" ");

        burger_shop.Deluxe deluxe1 = new burger_shop.Deluxe("Deluxe", burger_shop.Meat.beef, 4.96, burger_shop.Bread.pretzel);
        deluxe1.Deluxe();
        deluxe1.addTopping1("cheese", 1.25);
        System.out.println("Total Deluxe burger price is " + deluxe1.itemize());
        System.out.println(" ");


    }


}
