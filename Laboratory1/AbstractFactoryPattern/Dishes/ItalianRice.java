package Laboratory1.AbstractFactoryPattern.Dishes;

public class ItalianRice implements Rice{
    
    @Override
    public void prepare() {
        System.out.println("Preparing Italian Risotto");
    }

    @Override
    public void riceType() {
        System.out.println("Risotto with mushrooms");
    }

}
