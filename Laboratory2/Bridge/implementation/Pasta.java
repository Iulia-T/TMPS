package Laboratory2.Bridge.implementation;

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
