package tnsif.com;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    public void methodA() {
        System.out.println("Method A implementation");
    }

    public void methodB() {
        System.out.println("Method B implementation");
    }
}

public class InterfacetoInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
