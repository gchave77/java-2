package burger_shop;

public class Main {

    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        burger_shop.Burger burger = new burger_shop.Burger(burger_shop.Meat.beef, burger_shop.Meat.beef, 3.26, burger_shop.Bread.onion);
        burger.addTopping3("pickles", .25);
        burger.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger.itemize());
        System.out.println(" ");

        burger_shop.Burger burger2 = new burger_shop.Burger(burger_shop.Meat.chicken, burger_shop.Meat.chicken, 3.26, burger_shop.Bread.white);
        burger2.addTopping1("tomato", .25);
        burger2.addTopping2("lettuce", .25);
        burger2.addTopping3("pickles", .25);
        burger2.addTopping4("cheese", 1.25);
        System.out.println("Total price is " + burger2.itemize());
        System.out.println(" ");

        burger_shop.HealthyBurger healthyBurger = new
                burger_shop.HealthyBurger("turkey", 4.26);
        healthyBurger.healthyTopping1("egg", 2.49);
        healthyBurger.healthyTopping2("avocado", 1.49);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemize());
        System.out.println(" ");

        burger_shop.Deluxe deluxe = new burger_shop.Deluxe();
//        deluxe.addTopping1();




    }


}
