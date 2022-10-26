package Laboratory1.BuilderPattern;

public class DishBuilder implements Builder {

    private String garnish;
    private String sauce;
    private String meat;
    private String vegetables;
    private String decoration;
    @Override
    public DishBuilder garnish(String garnish) {
        this.garnish = garnish;
        return this;
    }

    @Override
    public DishBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public DishBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public DishBuilder vegetables(String vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    @Override
    public DishBuilder decoration(String decoration) {
        this.decoration = decoration;
        return this;
    }

    public Dish build() {
        return new Dish(garnish, sauce, meat, vegetables, decoration);
    }
    
}
