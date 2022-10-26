package Laboratory1.BuilderPattern;

public class Dish {

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

    @Override
    public String toString() {
        return """
                Pasta {
                    garnish=%s,
                    sauce=%s,
                    meat=%s,
                    vegetables=%s,
                    decoration=%s,
                }""".formatted(garnish, sauce, meat, vegetables, decoration);
    } 

}