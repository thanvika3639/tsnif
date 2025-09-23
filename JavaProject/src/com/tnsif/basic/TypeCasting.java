package com.tnsif.basic;

public class TypeCasting {

    public static void main(String[] args) {
        int num = 10;
        double d = num;
        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + d);

        double pi = 3.14159;
        int piInt = (int) pi;
        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + pi);
        System.out.println("Converted to int: " + piInt);

        char ch = 'A';
        int ascii = ch;
        System.out.println("\nChar to int casting:");
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);

        int code = 66;
        char letter = (char) code;
        System.out.println("\nInt to char casting:");
        System.out.println("Integer: " + code);
        System.out.println("Character: " + letter);
    }
}
