package Laboratory1.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {

        Restaurant sobaRest = new SobaRestaurant();
        sobaRest.orderPasta();

        System.out.println("==========================================");

        Restaurant udonRest = new UdonRestaurant();
        udonRest.orderPasta();

    }

}