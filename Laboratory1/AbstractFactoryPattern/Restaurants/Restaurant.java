package Laboratory1.AbstractFactoryPattern.Restaurants;

import Laboratory1.AbstractFactoryPattern.Dishes.*;

public abstract class Restaurant {

    public abstract Rice createRice();

    public abstract Pasta createPasta();

}