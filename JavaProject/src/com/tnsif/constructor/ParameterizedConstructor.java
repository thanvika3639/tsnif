package com.tnsif.constructor;

public class ParameterizedConstructor {

    public static void main(String[] args) {
        Student2 s1 = new Student2("Alice", 20);
        Student2 s2 = new Student2("Bob", 22);

        s1.display();
        s2.display();
    }
}

class Student2{
    String name;
    int age;

    Student2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
