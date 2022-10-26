package Laboratory1.AbstractFactoryPattern.Dishes;

public class AsianPasta implements Pasta {
    
    @Override
    public void prepare() {
        System.out.println("Preparing Asian Pasta");
    }

    @Override
    public void pastaType() {
        System.out.println("Soba Pasta with beef");
    }

}
