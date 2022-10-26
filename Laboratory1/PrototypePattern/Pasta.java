package Laboratory1.PrototypePattern;

public class Pasta extends Dish {
    
    private final String garnish;

    public Pasta(String garnish, String sauce, String meat, String vegetables, String decoration) {
        super(garnish, sauce, meat, vegetables, decoration);
        this.garnish = garnish;

    }

    private Pasta(Pasta pasta) {
        super(pasta);
        this.garnish = pasta.garnish;
    }

    @Override
    public Pasta clone() {
        return new Pasta(this);
    }

}
