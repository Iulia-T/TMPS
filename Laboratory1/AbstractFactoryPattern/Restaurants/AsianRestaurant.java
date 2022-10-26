package Laboratory1.AbstractFactoryPattern.Restaurants;

import Laboratory1.AbstractFactoryPattern.Dishes.*;

public class AsianRestaurant extends Restaurant {
    
    @Override
    public Rice createRice() {
        return new AsianRice();
    }

    @Override
    public Pasta createPasta() {
        return new AsianPasta();
    }


}
