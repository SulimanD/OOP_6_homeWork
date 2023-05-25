package OpenClosedPrinciple;

// Создание класса Vehicle
public class Vehicle {
    int maxSpeed;
    String type;
    double Coef;
// Конструктор класса Vehicle
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
// Метод для вызова коэффициента
    public double getCoef() { 
        return this.Coef; 
    }
// Метод для вызова максимальной скорости
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
// Метод для вызова типа транспортного средства
    public String getType() {
        return this.type;
    }
    }
