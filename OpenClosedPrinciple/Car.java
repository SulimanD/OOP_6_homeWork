package OpenClosedPrinciple;

// Создание класса Car, наследника класса Vehicle
public class Car extends Vehicle{
    int maxSpeed;
    String type;
    double Coef;
// Конструктор класса Car
    public Car (int maxSpeed, String type) { 
        super(maxSpeed, type);
        this.Coef = 0.8; 
        }
// Метод для вызова коэффициента
    public double getCoef() { 
        return this.Coef; 
    }
// Метод для вызова максимальной скорости
    public int getMaxSpeed() {
        return super.maxSpeed;
    }
// Метод для вызова типа транспортного средства
    public String getType() {
        return super.type;
    }
}
