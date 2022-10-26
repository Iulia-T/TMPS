package Laboratory1.AbstractFactoryPattern.Restaurants;

import Laboratory1.AbstractFactoryPattern.Dishes.*;

public class ItalianRestaurant extends Restaurant {
    @Override
    public Rice createRice() {
        return new ItalianRice();
    }

    @Override
    public Pasta createPasta() {
        return new ItalianPasta();
    }

}
