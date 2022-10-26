package Laboratory1.PrototypePattern;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        List<Dish> dishes = List.of(
                new Pasta("Soba", "Asian Sauce", "Beef","Peper, carrot, ognion" , "sesame"),
                new Rice("Rice", "Soy sauce", "Shrimps", "Peper, carrot", "sesame")
        );

        List<Dish> copyList = new ArrayList<>();
        for (Dish dish : dishes) {
            copyList.add(dish.clone());
        }

        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        DishCache registry = new DishCache();
        registry.put(dishes);
        System.out.println(registry.get("pasta_garnish pasta_meat"));

    }
    
}
