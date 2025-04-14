package JavaPractise.BasicInterface;

interface Vehicle {
    void start();  // abstract method
}

class Car implements Vehicleq {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Vehicleq myCar = new Car();
        myCar.start();  // Output: Car is starting...
    }
}

