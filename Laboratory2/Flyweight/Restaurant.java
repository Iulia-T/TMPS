/*package Laboratory2.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private final List<Dish> dishes = new ArrayList<>();

    public void makeDish(String meat, String type, String sauce, String vegetables) {
        DishType dishType = DishFactory.getDishType(type, sauce, vegetables);
        dishes.add(new Dish(meat, dishType));
    }

    public void displayDishes() {
        dishes.forEach(System.out::println);
    }

}*/