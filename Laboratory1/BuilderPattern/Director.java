package Laboratory1.BuilderPattern;

public class Director {
    public void buildUdon(Builder builder) {
        builder.garnish("Udon")
                .sauce("Asian")
                .vegetables("peper, ognion, carrot")
                .decoration("sesame");
    }

    public void buildBolognese(Builder builder) {
        builder.garnish("Pasta")
                .sauce("Tomato")
                .vegetables("tomato")
                .decoration("parmigiano");
    }
}