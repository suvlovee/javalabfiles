package inher;

//extends car implements vehicle and ev car
public class Mycar extends Car implements Vehicle, Ev {
    @Override
    public void on() {
        System.out.println("Car is on.");
    }

    @Override
    public void off() {
        System.out.println("Car is off.");
    }

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void run() {
        System.out.println("Car is running.");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage is 20 km/l.");
    }

    @Override
    public void batteryCapacity() {
        System.out.println("Battery capacity is 50 kWh.");
    }
    @Override
    public void changeGear(int gear) {
        System.out.println("Changing to gear " + gear);
    }
    @Override
    public void getFuelType() {
        System.out.println("Fuel type is electric.");
    }
    
    public static void main(String[] args) {
        Mycar car = new Mycar();
        car.on();
        car.start();
        car.run();
        car.mileage();
        car.batteryCapacity();
        car.off();
        car.changeGear(3);
        car.getFuelType();
    }
}
