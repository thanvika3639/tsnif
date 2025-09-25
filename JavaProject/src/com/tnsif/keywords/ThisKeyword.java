package com.tnsif.keywords;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    Student getStudent() {
        return this;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.display();
        Student s2 = s1.getStudent();
        s2.display();
    }
}

