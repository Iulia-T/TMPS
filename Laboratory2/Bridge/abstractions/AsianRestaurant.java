package Laboratory2.Bridge.abstractions;

import Laboratory2.Bridge.implementation.*;

public class AsianRestaurant extends Restaurant{
    
    public AsianRestaurant(Pasta pasta) {
        super(pasta);
    }

    @Override
    void addSauce() {
        pasta.setSauce("Soy Sauce");
    }

    @Override
    void addToppings() {
        pasta.setTopping("Parmezan");
    }

    @Override
    void addVegetables() {
        pasta.setVegetables("Peper, Mushrooms");
    }

}
