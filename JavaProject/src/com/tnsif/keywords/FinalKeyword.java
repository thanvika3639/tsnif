package com.tnsif.keywords;

class Parent {
    final void display() {
        System.out.println("This is a final method");
    }
}

final class FinalClass {
    void show() {
        System.out.println("This is a final class");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int value = 10;
        System.out.println(value);

        Parent p = new Parent();
        p.display();

        FinalClass f = new FinalClass();
        f.show();
    }
}
