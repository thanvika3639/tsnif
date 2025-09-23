package com.tnsif.string;
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.replace(6, 10, "Python");
        System.out.println(sb);

        sb.delete(6, 12);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
