package Laboratory2.Bridge.implementation;

public class ChickenPasta extends Pasta {

    @Override
    public void assemble() {
        System.out.println("Adding Chicken");
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Vegetables: " + vegetables);
        System.out.println("Adding Topping:" + topping);
        
    }
    
}
