class Shape {
    double length, breadth;

    Shape(double l, double b) {
        length = l;
        breadth = b;
    }

    public String getSHapeType() {
        String shapetype;
        if (length == breadth) {
            shapetype = "square";
        } else {
            shapetype = "rectangle";
        }
        return shapetype;
    }

    void area(String s) {
        if (s.equals("square")) { // string comparison
            System.out.println("The area of square is: " + Math.pow(length, 2));
        } else {
            System.out.println("The area of rectangle is: " + length * breadth);
        }
    }
}

public class ClassWork {
    public static void main(String[] args) {
        Shape a1 = new Shape(7, 6);
        String shape = a1.getSHapeType();
        System.out.println("Shape = " + shape);
        a1.area(shape);
    }
}