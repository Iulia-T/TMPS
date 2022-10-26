package Laboratory1.AbstractFactoryPattern.Dishes;

public class AsianRice implements Rice {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Asian Rice");
    }

    @Override
    public void riceType() {
        System.out.println("Rice with shrimps");
    }

}
