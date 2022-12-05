package Laboratory2.Bridge.implementation;

public class BeefPasta extends Pasta {

    @Override
    public void assemble() {
        System.out.println("Adding Beef");
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding vegetables: " + vegetables);
        System.out.println("Adding Topping:" + topping);
    }
    
}
