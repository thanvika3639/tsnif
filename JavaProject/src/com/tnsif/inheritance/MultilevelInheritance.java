package com.tnsif.inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("Car is refueling");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar is using turbo mode");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.fuel();
        sc.turbo();
    }
}
