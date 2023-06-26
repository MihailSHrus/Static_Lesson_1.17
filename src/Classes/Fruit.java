package Classes;

public abstract class Fruit {
    public Fruit() {}
    public  Fruit(double weight) {
        this.weight = weight;
    }

    public double weight;
    public double price;
    public double sum;
    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }
    public abstract double getPrice();
    public static double getSum() {
        return Apple.getSum() + Apricot.getSum() + Peach.getSum();
    }
}
