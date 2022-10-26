package Laboratory1.BuilderPattern;

public interface Builder {

    Builder garnish(String garnish);

    Builder sauce(String sauce);

    Builder meat(String meat);

    Builder vegetables(String vegetables);

    Builder decoration(String decoration);
    
}
