# Laboratory work №2. Structural Design Patterns.

### Course: TMPS
### Author: Iulia Tarus, FAF-202

## Objectives:

1. Study and understand the Structural Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some structural design patterns for object instantiation in a sample project.


## Implementation description

In the Laboratory2 folder can be found 3 structural design patterns, implemented in Java. Each of the 3 patterns was implemented on the basis of the example of a Restaurant, specialised on Pasta. 


#### Abstract Pattern
The Adapter pattern is used for connecting two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the interface needed.
In my project, it was implemanted the Adapter pattern based on a Restaurant Application, displaying the menu from json and connecting it with xml.
```
public class FancyUIServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Recommendations using converted JSON data...");
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }
}
```

#### Bridge Pattern
The Bridge pattern is used to decouple an abstraction from its implementation so that the two can vary independently. This means to create a bridge interface that uses OOP principles to separate out responsibilities into different abstract classes.
Abstraction classes are based on Restaurant class
```
public abstract class Restaurant {

    protected Pasta pasta;

    protected Restaurant(Laboratory2.Bridge.implementation.Pasta pasta2) {
        this.pasta = pasta2;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void addVegetables();

    public void deliver() {
        System.out.println("Order in Progress!");
        addSauce();
        addToppings();
        addVegetables();
        pasta.assemble();
    }

}
```
Implementation classes are based on Pasta class.
```
public abstract class Pasta {

    protected String sauce;
    protected String vegetables;
    protected String topping;

    public abstract void assemble();

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

}
```
This is how they are linked:
```
package Laboratory2.Bridge;
import Laboratory2.Bridge.abstractions.*;
import Laboratory2.Bridge.implementation.*;

public class Main {

    public static void main(String[] args) {

        Restaurant italianRestaurant = new ItalianRestaurant(new ChickenPasta());
        italianRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant asianRestaurant = new AsianRestaurant(new BeefPasta());
        asianRestaurant.deliver();

    }
    
}
```

#### Composite Pattern
The composite pattern is meant to allow treating individual objects and compositions of objects, or “composites” in the same way. It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.
The implemetation starts from Pasta interface.
```
public interface Pasta {
    public void setPasta();
}
```
Inherited structure is like that:
```
public class Soba implements Pasta {

    @Override
    public void setPasta() {
        System.out.println("Soba Pasta to be delivered");
        
    }
    
}
```
Pasta types are added in the set in that way:
```
public class Delivery {

    private List<Pasta> pastaSet = new ArrayList<Pasta>();
    
    public void addPasta(Pasta pasta){
        pastaSet.add(pasta);
    }

    public void removePasta(Pasta pasta){
        pastaSet.remove(pasta);
    }

    public void createFamilySet(){
        System.out.println("Creating family set offer ...");
        for (Pasta pasta: pastaSet) {
            pasta.setPasta();
        }
    }
}
```
## Conclusions
After performing this laboratory work, I got familiar with Structural Design Patterns, both theoretically and practically, implementing it in Java. In order to compare them, I used an unique field, a Restaurant with Pasta. This gave me a comparison between them, understanding in which situations I could use each structural dessign pattern.