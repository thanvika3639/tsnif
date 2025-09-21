package tnsif.com;

public class GetterSetter{

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("Alice");
        s1.setAge(20);

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}

class Student1{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

