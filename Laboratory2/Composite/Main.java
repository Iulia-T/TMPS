package Laboratory2.Composite;

public class Main {

    public static void main(String[] args) {
        Delivery delivery = new Delivery();

        Pasta chikenSoba = new Soba();
        Pasta shrimpSoba = new Soba();
        Pasta beefUdon = new Udon();
        Pasta Bolognese = new Bolognese();

        delivery.addPasta(chikenSoba);
        delivery.addPasta(shrimpSoba);
        delivery.addPasta(beefUdon);
        delivery.addPasta(Bolognese);

        delivery.createFamilySet();
    }
    
}
