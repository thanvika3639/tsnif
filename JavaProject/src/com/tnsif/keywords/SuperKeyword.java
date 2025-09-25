package com.tnsif.keywords;

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void displayNames() {
        System.out.println(super.name);
        System.out.println(name);
    }

    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayNames();
        d.sound();
    }
}
