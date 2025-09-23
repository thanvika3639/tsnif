package com.tnsif.basic;
public class TypeConversion {

    public static void main(String[] args) {
        int a = 25;
        double b = a;
        System.out.println("Integer to Double: " + b);

        double c = 9.78;
        int d = (int) c;
        System.out.println("Double to Integer: " + d);

        char ch = 'Z';
        int e = ch;
        System.out.println("Char to Integer: " + e);

        int f = 70;
        char g = (char) f;
        System.out.println("Integer to Char: " + g);
    }
}
