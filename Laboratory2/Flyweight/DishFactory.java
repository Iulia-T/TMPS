/*package Laboratory2.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DishFactory {

    private static final Map<String, DishType> dishTypes = new HashMap<>();

    public static DishType getDishType(String type, String sauce, String vegetables) {
        if (dishTypes.get(type) == null) {
            dishTypes.put(type, new DishType(type, sauce, vegetables));
        }
        return dishTypes.get(type);
    }

}*/
