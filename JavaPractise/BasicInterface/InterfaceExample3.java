package JavaPractise.BasicInterface;

interface Vehicleq {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Bike implements Vehicleq {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.start(); // Output: Bike is starting...
        myBike.stop();  // Output: Vehicle is stopping...
    }
}

