package tnsif.com;

class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog1 extends Animal2 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
    }
}
