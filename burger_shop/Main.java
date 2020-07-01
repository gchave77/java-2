package burger_shop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application


        burger_shop.Burger burger1 = new burger_shop.Burger(burger_shop.Meat.beef, burger_shop.Meat.beef, 3.26, burger_shop.Bread.onion);
        burger1.addTopping3(burger_shop.Toppings.pickles, burger_shop.Toppings.price);
        burger1.addTopping4(burger_shop.Toppings.cheese, burger_shop.Toppings.cheesePrice);
        System.out.println("Total price is " + burger1.itemize());
        System.out.println(" ");

        burger_shop.Burger burger2 = new burger_shop.Burger(burger_shop.Meat.chicken, burger_shop.Meat.chicken, 3.26, burger_shop.Bread.white);
        burger2.addTopping1(burger_shop.Toppings.tomato, burger_shop.Toppings.price);
        burger2.addTopping2(burger_shop.Toppings.lettuce, burger_shop.Toppings.price);
        burger2.addTopping4(burger_shop.Toppings.cheese, burger_shop.Toppings.cheesePrice);
        System.out.println("Total price is " + burger2.itemize());
        System.out.println(" ");

        burger_shop.HealthyBurger healthy1 = new
                burger_shop.HealthyBurger("Healthy1", burger_shop.Meat.turkey, 5.96, burger_shop.Bread.wheat);
        healthy1.healthyTopping1("egg", 2.49);
        healthy1.healthyTopping2("avocado", 1.49);
        System.out.println("Total Healthy1 burger price is " + healthy1.itemize());
        System.out.println(" ");

        burger_shop.Deluxe deluxe1 = new burger_shop.Deluxe("Deluxe1", burger_shop.Meat.beef, 4.96, burger_shop.Bread.pretzel);
        deluxe1.Deluxe();
        deluxe1.addTopping1(burger_shop.Toppings.cheese, burger_shop.Toppings.cheesePrice);
        System.out.println("Total Deluxe1 burger price is " + deluxe1.itemize());
        System.out.println(" ");

        burger_shop.Deluxe deluxe2 = new burger_shop.Deluxe("Deluxe2", burger_shop.Meat.brisket, 5.95, burger_shop.Bread.rye);
        deluxe2.Deluxe();
        deluxe2.addTopping1(burger_shop.Toppings.lettuce, burger_shop.Toppings.price);
        System.out.println("Total Deluxe2 burger price is " + deluxe2.itemize());
        System.out.println(" ");

        burger_shop.Meal meal1 = new burger_shop.Meal("Combo meal", burger_shop.Meat.beef, 6.75, burger_shop.Bread.onion,
                burger_shop.Drinks.coke, burger_shop.Drinks.drinkPrice, burger_shop.Sides.applePie, burger_shop.Sides.sidePrice);
        meal1.addTopping1(burger_shop.Toppings.cheese, burger_shop.Toppings.cheesePrice);
        System.out.println("Total Combo Meal price is " + meal1.itemize());
        System.out.println(" ");

    }


}
