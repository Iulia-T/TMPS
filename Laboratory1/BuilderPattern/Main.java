package Laboratory1.BuilderPattern;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        DishBuilder builder = new DishBuilder();
        director.buildUdon(builder);
        builder.meat("Chicken");
        System.out.println(builder.build());

        DishBuilder builder1 = new DishBuilder();
        director.buildBolognese(builder);
        builder1.meat("Beef");
        System.out.println(builder.build());

    }

    
}
