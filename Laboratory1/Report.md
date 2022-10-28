# Laboratory work №1. Creational Design Patterns.

### Course: TMPS
### Author: Iulia Tarus, FAF-202

## Objectives:

1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.


## Implementation description

In the Laboratory1 folder can be found 5 creational design patterns, implemented in Java. Each of the 5 patterns was implemented on the basis of the example of a Restaurant, specialised on Pasta and Rice. 


#### Factory Method Pattern
It is based on the principle: Define an interface or abstract class for creating an object, but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
```
public abstract class Restaurant {

    public void orderPasta() {
        System.out.println("Ordering Pasta...");
        Pasta pasta = createPasta();
        pasta.prepare();
    }

    public abstract Pasta createPasta();

}
```
```
public class SobaRestaurant extends Restaurant {

    @Override
    public Pasta createPasta() {
        System.out.println("Creating Soba Pasta...");
        return new SobaPasta();
    }
    
}    
```

#### Abstract Factory Pattern
Abstract Factory patterns work around a super-factory which creates other factories.In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the factory pattern.
```
public abstract class Restaurant {

    public abstract Rice createRice();

    public abstract Pasta createPasta();

}
```
```
public class ItalianRestaurant extends Restaurant {

    @Override
    public Rice createRice() {
        return new ItalianRice();
    }

    @Override
    public Pasta createPasta() {
        return new ItalianPasta();
    }

}
```

#### Builder Pattern
Builder pattern builds a complex object using simple objects and using a step by step approach. A Builder class builds the final object step by step. This builder is independent of other objects.
```
public interface Builder {

    Builder garnish(String garnish);

    Builder sauce(String sauce);

    Builder meat(String meat);

    Builder vegetables(String vegetables);

    Builder decoration(String decoration);
    
}
```
#### Prototype Pattern
Prototype pattern refers to creating duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
```
public class Main {
    
    public static void main(String[] args) {

        List<Dish> dishes = List.of(
                new Pasta("Soba", "Asian Sauce", "Beef","Peper, carrot, ognion" , "sesame"),
                new Rice("Rice", "Soy sauce", "Shrimps", "Peper, carrot", "sesame")
        );

        List<Dish> copyList = new ArrayList<>();
        for (Dish dish : dishes) {
            copyList.add(dish.clone());
        }

        copyList.forEach(System.out::println);

        System.out.println("==========================================");

        DishCache registry = new DishCache();
        registry.put(dishes);
        System.out.println(registry.get("pasta_garnish pasta_meat"));

    }
    
}
```

#### Singleton Pattern
Singleton pattern is one of the simplest design patterns in Java. This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
```
public class Singleton {
    
    private final String data;

    private static volatile Singleton instance;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }

}
```

## Conclusions
After performing this laboratory work, I got familiar with Creational Design Patterns, both theoretically and practically, implementing it in Java. In order to compare them, I used an unique field, a Restaurant. This gave me a comparison between them, understanding in which situations I could use each creational dessign pattern.