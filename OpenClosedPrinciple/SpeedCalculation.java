package OpenClosedPrinciple;

// Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). 
// Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP.

// Создание класса SpeedCalculation
public class SpeedCalculation {
// Метод calculateAllowedSpeed(), который считает допустимую скорость
    public static double calculateAllowedSpeed(Vehicle vehicle) {
// if (vehicle.getType().equalsIgnoreCase("Car")) {
        return vehicle.getMaxSpeed() * vehicle.getCoef();
// } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
// return vehicle.getMaxSpeed() * 0.6;
    }
}



