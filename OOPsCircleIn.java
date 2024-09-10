import java.util.Scanner;

// Base class Shape
class Shape {
    void getPerimeter() {
        System.out.println("Hello Perimeter");
    }

    void getArea() {
        System.out.println("Hello Area");
    }
}

// Derived class Circle1 that extends Shape
class Circle1 extends Shape {
    double r;

    // Constructor to initialize radius
    Circle1(float r) {
        this.r = r;
    }

    // Override method to calculate and print the perimeter of the circle
    @Override
    void getPerimeter() {
        double p = 2 * Math.PI * r;  // Use Math.PI for more accurate value of pi
        System.out.printf("Perimeter of the circle with radius %.2f: %.2f%n", r, p);
    }

    // Override method to calculate and print the area of the circle
    @Override
    void getArea() {
        double ar = Math.PI * r * r;  // Use Math.PI for more accurate value of pi
        System.out.printf("Area of the circle with radius %.2f: %.2f%n", r, ar);
    }
}

// Main class to execute the program
public class OOPsCircleIn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float r = in.nextFloat();  // Read radius from user input

        // Create an instance of Circle1 with the given radius
        Circle1 obj = new Circle1(r);
        obj.getPerimeter();
        obj.getArea();
    }
}


