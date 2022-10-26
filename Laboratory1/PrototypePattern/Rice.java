package Laboratory1.PrototypePattern;

public class Rice extends Dish{
    
    private final String garnish;

    public Rice(String garnish, String sauce, String meat, String vegetables, String decoration) {
        super(garnish, sauce, meat, vegetables, decoration);
        this.garnish = garnish;

    }

    private Rice(Rice rice) {
        super(rice);
        this.garnish = rice.garnish;
    }

    @Override
    public Rice clone() {
        return new Rice(this);
    }

}
