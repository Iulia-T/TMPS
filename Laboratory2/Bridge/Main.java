package Laboratory2.Bridge;
import Laboratory2.Bridge.abstractions.*;
import Laboratory2.Bridge.implementation.*;

public class Main {

    public static void main(String[] args) {

        Restaurant italianRestaurant = new ItalianRestaurant(new ChickenPasta());
        italianRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant asianRestaurant = new AsianRestaurant(new BeefPasta());
        asianRestaurant.deliver();

    }
    
}
