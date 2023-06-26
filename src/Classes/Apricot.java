package Classes;

public class Apricot extends Fruit {
    public  Apricot (double weight) {
        this.weight += weight;
    }
    public static double weight;
    public static double price = 150;
    public double getPrice() {
        return price;
    }
    public static double getSum() {
        return price * weight;
    }
}
