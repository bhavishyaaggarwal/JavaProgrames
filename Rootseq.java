import java.util.*;
class Rootseq 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients");
        System.out.println("Value of a,b,c quadratic equation ax^2 + bx + c = 0");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d >= 0) 
        {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Real Roots:");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        }
        else
       {
          
            System.out.println("No real roots. Discriminant is negative.");
        }

    }
}