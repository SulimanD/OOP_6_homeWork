package OpenClosedPrinciple;
import OpenClosedPrinciple.SpeedCalculation;

public class App {
    public static void main(String[] args) throws Exception{
    Car BMW = new Car(100, "Car");
    // System.out.println(BMW.getCoef());
    // System.out.println(BMW.getMaxSpeed());
    // System.out.println(BMW.getType());
    System.out.println(SpeedCalculation.calculateAllowedSpeed(BMW));

    Bus UAZ = new Bus(70, "Bus");
    // System.out.println(UAZ.getCoef());
    // System.out.println(UAZ.getMaxSpeed());
    // System.out.println(UAZ.getType());
    System.out.println(SpeedCalculation.calculateAllowedSpeed(UAZ));
}
}
