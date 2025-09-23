package com.tnsif.string;

public class StringMethods {
    public static void main(String[] args) {
        String s = " Hello World ";
        String s2 = "Java";

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.substring(1, 6));
        System.out.println(s.concat(s2));
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.replace("World", "Java"));
        System.out.println(s.equals(" Hello World "));
        System.out.println(s.equalsIgnoreCase(" hello world "));
        System.out.println(s.startsWith(" H"));
        System.out.println(s.endsWith(" "));
        System.out.println(s.isEmpty());
        System.out.println(s2.repeat(3));
        System.out.println(s2.contains("av"));
        System.out.println(String.join("-", "A", "B", "C"));
    }
}

