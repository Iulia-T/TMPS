package Laboratory1.AbstractFactoryPattern;

import java.util.List;

import Laboratory1.AbstractFactoryPattern.Dishes.Dish;
import Laboratory1.AbstractFactoryPattern.Restaurants.*;

public class Main {

        public static void main(String[] args) {

        Restaurant asian = new AsianRestaurant();
        Restaurant italian = new ItalianRestaurant();

        List.of(italian.createPasta(), italian.createRice(), asian.createPasta(), asian.createRice()).forEach(Dish::prepare);

    }

}
