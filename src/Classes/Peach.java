package Classes;

public class Peach extends Fruit {
    public  Peach (double weight) {
        this.weight += weight;
    }
    public static double weight;
    public static double price = 200;
    public double getPrice() {
        return price;
    }
    public static double getSum() {
        return price * weight;
    }
}
