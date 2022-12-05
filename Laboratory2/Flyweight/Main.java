/*package Laboratory2.Flyweight;

import java.util.List;
import java.util.Random;

public class Main {
    
    private static final int DISH_TYPES = 3;
    private static final int DISHES_TO_INSERT = 10_000_000;

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        for (int i = 0; i < DISHES_TO_INSERT / DISH_TYPES; i++) {
            restaurant.makeDish(getRandomMeat(), "Soba", "Soy Sauce", "Peper, Mushrooms");
            restaurant.makeDish(getRandomMeat(), "Udon", "Asian", "Peper");
            restaurant.makeDish(getRandomMeat(), "Rice", "Rice Sauce", "Mushrooms, ognion");
        }
//        restaurant.displayDishes();
        System.out.println(DISHES_TO_INSERT + " DISHES Inserted");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + DISHES_TO_INSERT + " + BookTypes Size (30 bytes) * " + DISH_TYPES + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((DISHES_TO_INSERT * 20 + DISH_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((DISHES_TO_INSERT * 50) / 1024 / 1024) + "MB)");
        

    }

    private static String getRandomMeat() {
        List<String> dishes = List.of("beef", "chiken", "salmon", "shrimps", "tuna");
        return dishes.get(new Random().nextInt(dishes.size()));
    }

}
*/