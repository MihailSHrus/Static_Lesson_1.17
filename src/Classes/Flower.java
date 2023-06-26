package Classes;
public class Flower {
    // Конструктор
    public Flower() {
    }
    public Flower(String... array) {
        for (String a:array) {
            Flower f = new Flower();
            switch (a) {
                case "Orchid":
                    sum += Orchid.getPrice();
                    break;
                case "Rose":
                    sum += Rose.getPrice();
                    break;
                case "Tulip":
                    sum += Tulip.getPrice();
                    break;
                case "Carnation":
                    sum += Carnation.getPrice();
                    break;
            }

        }
    }

    // Блок полей
    static int noOfObjects = 0; // Подсчёт кол-ва созданных объектов
    {
        noOfObjects +=1;
    }
    private String country;
    private int storageDays;
    public double price;
    public double sum;
    // Блок методов
    public static int getNoOfObjects() {
        return noOfObjects;
    }
    public double getSum() {
        return sum;
    }
}


