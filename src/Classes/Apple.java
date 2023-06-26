package Classes;

public class Apple extends Fruit {
    public  Apple(double weight) {
        this.weight += weight;
    }
    public static double weight;
    public static double price = 100;
    public double getPrice() {
        return price;
    }
    public static double getSum() {
        return price * weight;
    }
}
