package tnsif.com;

public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 10;
        c += 5; 
        System.out.println("c += 5 → " + c);
        c -= 3; 
        System.out.println("c -= 3 → " + c);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int d = 7;
        System.out.println("d++ = " + (d++));
        System.out.println("++d = " + (++d));
        System.out.println("d-- = " + (d--));
        System.out.println("--d = " + (--d));
    }
}
