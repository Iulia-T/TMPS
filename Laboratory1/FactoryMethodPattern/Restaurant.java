package Laboratory1.FactoryMethodPattern;

public abstract class Restaurant {

    public void orderPasta() {
        System.out.println("Ordering Pasta...");
        Pasta pasta = createPasta();
        pasta.prepare();
    }

    public abstract Pasta createPasta();

}