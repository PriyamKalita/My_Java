package ClassRoomIT916;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    public void ride() {
        System.out.println("Motorcycle is riding");
    }
}

class SportsCar extends Car {
    public void accelerate() {
        System.out.println("Sports car is accelerating");
    }
}


public class Main {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.start();
        myCar.accelerate();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.start();
        myMotorcycle.ride();
    }
    }

