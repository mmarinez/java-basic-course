package chapter9;

public class Cake {
    private String flavor;
    private double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake(String flavor) {
        System.out.println("This is the " + flavor);
    }
}
