import java.util.*;

class Shape 
{
    private String type;
    public Shape(String type) 
    {
        this.type = type;
    }
    public double area(double l, double b) 
    {
        return l * b;
    }
    public double area(double base, double h, String shapeType)
    {
        return 0.5 * base * h;
    }
    public double area(double r, String shapeType) 
    {
        return Math.PI * r * r;
    }
}

public class ShapeMain 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double l = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double b = scanner.nextDouble();
        Shape r = new Shape("rectangle");
        double rectangleArea = r.area(l, b);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double h = scanner.nextDouble();
        Shape t = new Shape("triangle");
        double triangleArea = t.area(base, h, "triangle");
        System.out.println("Area of Triangle: " + triangleArea);
        System.out.print("Enter radius of the circle: ");
        double ri = scanner.nextDouble();
        Shape c = new Shape("circle");
        double circleArea = c.area(ri, "circle");
        System.out.println("Area of Circle: " + circleArea);
    }
}
