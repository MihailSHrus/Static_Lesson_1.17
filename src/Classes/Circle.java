package Classes;

public class Circle {
    // Конструктор
    public Circle() {};
    public Circle(double r) {
        radius = r;
    };
    // Блок полей
    public double radius;
    final double PI = 3.1415;
    // Блок методов
    public double circleLength() {
        return 2 * radius * PI;
    }
    public double circleArea() {
        return PI * radius * radius;
    }
}
