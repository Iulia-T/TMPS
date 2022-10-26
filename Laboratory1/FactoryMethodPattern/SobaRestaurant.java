package Laboratory1.FactoryMethodPattern;

public class SobaRestaurant extends Restaurant {

    @Override
    public Pasta createPasta() {
        System.out.println("Creating Soba Pasta...");
        return new SobaPasta();
    }

}
