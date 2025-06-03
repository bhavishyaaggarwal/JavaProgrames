import java.util.*;

class Shape 
{
    private String name;
    public Shape() 
    {
        System.out.println("Welcome to ractangle and circle area calculator");
    }
    public Shape(String name, double length, double breadth) 
    {
        this.name = name;
        double area = area(length, breadth);
        System.out.println("Area of " + name + " (Rectangle): " + area);
    }
    public Shape(String name, double radius) 
    {
        this.name = name;
        double area = area(radius);
        System.out.println("Area of " + name + " (Circle): " + area);
    }
    private double area(double length, double breadth) 
    {
        return length * breadth;
    }
    private double area(double radius) 
    {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Shape s = new Shape();
        System.out.print("Enter name of the rectangle: ");
        String rectangleName = scanner.nextLine();
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        Shape r = new Shape(rectangleName, length, breadth);
        System.out.print("\nEnter name of the circle: ");
        String circleName = scanner.next();
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape c = new Shape(circleName, radius);
    }
}