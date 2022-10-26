package Laboratory1.PrototypePattern;

public abstract class Dish {

    private final String garnish;
    private final String sauce;
    private final String meat;
    private final String vegetables;
    private final String decoration;

    Dish(String garnish, String sauce, String meat, String vegetables, String decoration) {
        this.garnish = garnish;
        this.sauce = sauce;
        this.meat = meat;
        this.vegetables = vegetables;
        this.decoration = decoration;
    }

    protected Dish(Dish dish) {
        this.garnish = dish.garnish;
        this.sauce = dish.sauce;
        this.meat = dish.meat;
        this.vegetables = dish.vegetables;
        this.decoration = dish.decoration;
    }

    public abstract Dish clone();

    public String getGarnish() {
        return garnish;
    }

    public String getMeat() {
        return meat;
    }
    
}
