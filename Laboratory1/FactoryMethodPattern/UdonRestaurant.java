package Laboratory1.FactoryMethodPattern;

public class UdonRestaurant extends Restaurant {

    @Override
    public Pasta createPasta() {
        System.out.println("Creating Udon Pasta...");
        return new UdonPasta();
    }

}
