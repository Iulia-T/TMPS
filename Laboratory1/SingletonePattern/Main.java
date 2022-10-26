package Laboratory1.SingletonePattern;

public class Main {
 
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance("Pasta"));
        Singleton singleton = Singleton.getInstance("Singleton");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }
    
}
