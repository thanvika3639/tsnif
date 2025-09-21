package tnsif.com;
abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape sq = new Square(4);

        rect.area();
        sq.area();
    }
}

