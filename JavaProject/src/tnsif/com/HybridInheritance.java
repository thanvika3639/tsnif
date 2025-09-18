package tnsif.com;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    Mammal(String name) {
        super(name);
    }
    void breathe() {
        System.out.println(name + " is breathing.");
    }
}

interface Pet {
    void play();
    void ownerInfo(String owner);
}

class Dog extends Mammal implements Pet {
    Dog(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(name + " is playing fetch.");
    }

    @Override
    public void ownerInfo(String owner) {
        System.out.println(name + "'s owner is " + owner + ".");
    }

    void bark() {
        System.out.println(name + " says: Woof!");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.eat();
        d.breathe();
        d.bark();
        d.play();
        d.ownerInfo("Doobist");
    }
}
