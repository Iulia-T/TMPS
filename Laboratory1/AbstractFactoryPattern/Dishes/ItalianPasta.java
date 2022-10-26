package Laboratory1.AbstractFactoryPattern.Dishes;

public class ItalianPasta implements Pasta {

    @Override
    public void prepare() {
        System.out.println("Preparing Italian Pasta");
    }

    @Override
    public void pastaType() {
        System.out.println("Carbonara Pasta");
    }

}
