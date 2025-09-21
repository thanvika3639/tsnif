package tnsif.com;

public class DefaultConstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

class Student {
    String name;
    int age;

    Student() {
        name = "John Doe";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
