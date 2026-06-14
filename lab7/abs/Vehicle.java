//wap to create an abstract class having two abstract methods and one non
//abstract method. derive a class from the abstract class and add more methods.
//create main methods to call all the methods.

package abs;

public abstract class Vehicle{
    abstract void on();
    abstract void off();
    public void vehicle() {
        System.out.println("This is a vehicle.");
    }
}