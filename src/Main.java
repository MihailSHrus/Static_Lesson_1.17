import Classes.*;


import javax.swing.plaf.ComponentInputMapUIResource;

public class Main {
    public static void main(String[] args) {
        //
        System.out.println("-Задание 1-");
        Phone ph1 = new Phone();
        Phone ph2 = new Phone("+79912341234", "7s");
        Phone ph3 = new Phone();
        System.out.println("Количество записанных телефонов = " + Phone.getNoOfObjects());
        //
        System.out.println("-Задание 2-");
        Flower buc1 = new Flower("Rose","Orchid","Rose","Carnation");
        Flower buc2 = new Flower("Tulip","Orchid","Orchid","Rose","Rose");
        Flower buc3 = new Flower("Rose","Tulip","Carnation");
        System.out.println("Стоимость 1-ого букета = " + buc1.getSum());
        System.out.println("Стоимость 2-ого букета = " + buc2.getSum());
        System.out.println("Стоимость 3-ого букета = " + buc3.getSum());
        System.out.println("Всего продано цветов = " + Flower.getNoOfObjects());
        //
        System.out.println("-Задание 3-");
        Apple f1 = new Apple(2.5);
        Apricot f2 = new Apricot(1.3);
        Peach f3 = new Peach(0.6);
        Apple f4 = new Apple (1.0);
        Peach f5 = new Peach(1.2);
        Apricot f6 = new Apricot(3.1);
        Apple f7 = new Apple (4.1);
        System.out.println("Общая стоимость проданных фруктов = " + Fruit.getSum());
        System.out.println("Общая стоимость проданных Яблок = " + Apple.getSum());
        System.out.println("Общая стоимость проданных Абрикосов = " + Apricot.getSum());
        System.out.println("Общая стоимость проданных Груш = " + Peach.getSum());
        //
        System.out.println("-Задание 4-");
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(8.2);
        Circle c3 = new Circle(3.14);
        System.out.println("Круг 1: Длинна окружности - " + c1.circleLength() + ", Площадь круга - " + c1.circleArea());
        System.out.println("Круг 2: Длинна окружности - " + c2.circleLength() + ", Площадь круга - " + c2.circleArea());
        System.out.println("Круг 3: Длинна окружности - " + c3.circleLength() + ", Площадь круга - " + c3.circleArea());
    }
}