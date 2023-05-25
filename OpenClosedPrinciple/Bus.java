package OpenClosedPrinciple;

// Создание класса Bus, наследника класса Vehicle
public class Bus extends Vehicle {
    int maxSpeed;
    String type;
    double Coef;
// Конструктор класса Bus
    public Bus (int maxSpeed, String type) {
        super(maxSpeed, type);
        this.Coef = 0.6;
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
