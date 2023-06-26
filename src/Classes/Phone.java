package Classes;

import java.io.Serializable;
public class Phone implements Serializable {
    // Конструкторы
    public Phone() {

    }
    public Phone(String nu, String mo) {
        number = nu;
        model = mo;
    }
    public Phone(String n, String m, double w) {
        this(n, m);
        weight = w;
    }
    // Блок переменных
    static int noOfObjects = 0; // Подсчёт кол-ва созданных объектов
    {
        noOfObjects +=1;
    }
    public String number;
    public String model;
    public double weight;
    public boolean deceased;
    // Блок методов
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void setNumber(String num) {
        number = num;
    }
    public void setModel(String mod) {
        model = mod;
    }
    public void setWeight(double wei) {
        weight = wei;
    }
    public void receiveCall(String name) {
        System.out.println(" Звонит " + name);
    }
    public void receiveCall(String number, String name) {
        System.out.println(number + " Звонит " + name);
    }
    public void sendMessagec(String... array){
        for (String i:array) {
            System.out.println(i + " ");
        }
    }
    public static int getNoOfObjects() {
        return noOfObjects;
    }
    // Переопределение методов equals(), hashCode(), toString()
    public boolean equal(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone that = (Phone) o;

        if (deceased != that.deceased) {
            return false;
        }
        return !(number != null ? !number.equals(that.number) : that.number != null);
    }
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (deceased ? 1 : 0);
        return result;
    }
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", deceased=" + deceased +
                '}';
    }
}
