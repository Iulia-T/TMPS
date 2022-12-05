package Laboratory2.Bridge.abstractions;

import Laboratory2.Bridge.implementation.*;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pasta pasta) {
        super(pasta);
    }

    @Override
    void addSauce() {
        pasta.setSauce("Tomato Sauce");
    }

    @Override
    void addToppings() {
        pasta.setTopping("Parmezan");
    }

    @Override
    void addVegetables() {
        pasta.setVegetables("Peper");
    }
    
}
