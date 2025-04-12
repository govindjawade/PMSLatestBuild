package JavaPractise.Inheritance1;
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class MethodOverrideTestOverride {
    public static void main(String[] args) {
        Vehicle v1=new Bike();// Upcasting
        v1.start();
        Vehicle v2=new Car();
        v2.start();

        Vehicle v11=new Vehicle();
        v11.start();
    }
}
