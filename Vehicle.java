package vehicle;
abstract class VehicleClassifier
{
    abstract void start();
    abstract void stop();
}
class Car extends VehicleClassifier
{
    void start()
    {
        System.out.println("Car Started");
    }
    void stop()
    {
        System.out.println("Car Stoped");
    }
}
class Motorcycle extends VehicleClassifier
{
    void start()
    {
        System.out.println("Motorcycle Started");
    }
    void stop()
    {
        System.out.println("Motorcycle Stoped");
    }
}
public class Vehicle {
    public static void main(String[] args) {

        Car car=new Car();
        car.start();
        car.stop();
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}