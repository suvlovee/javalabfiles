package  abs;

public class Car extends Vehicle{
   @Override
    void on() {
        System.out.println("Car is on.");
    }
    
   @Override
    void off() {
        System.out.println("Car is off.");
    }   
    void myCar() {
        System.out.println("This is my car.");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.on();
        car.off();
        car.myCar();
    }
}