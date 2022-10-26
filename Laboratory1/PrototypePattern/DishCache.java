package Laboratory1.PrototypePattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DishCache {
    
    private final Map<String, Dish> cache = new HashMap<>();

    public DishCache() {
        Pasta pasta = new Pasta("Udon", "Asian Sauce", "Chicken","Peper, carrot, ognion" , "sesame");
        Rice rice = new Rice("Rice", "Sweet chilly", "Salmon","Peper, carrot" , "sesame");

        cache.put("Udon Chicken", pasta);
        cache.put("Rice Salmon", rice);
    }

    public Dish get(String key) {
        return cache.get(key).clone();
    }

    public void put(List<Dish> dishes) {
        dishes.forEach(dish -> cache.put(dish.getGarnish() + " " + dish.getMeat(), dish));
    }

}
