package Laboratory2.Bridge.abstractions;

import Laboratory2.Bridge.implementation.Pasta;

public abstract class Restaurant {

    protected Pasta pasta;

    protected Restaurant(Laboratory2.Bridge.implementation.Pasta pasta2) {
        this.pasta = pasta2;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void addVegetables();

    public void deliver() {
        System.out.println("Order in Progress!");
        addSauce();
        addToppings();
        addVegetables();
        pasta.assemble();
    }

}