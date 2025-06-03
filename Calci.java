import java. util.*;
class Calci
{
	double x,y;
	double add(double x,double y)
	{
		return (x+y);
	}
	double sub(double x,double y)
	{
		return (x-y);
	}
	double muty(double x,double y)
	{
		return (x*y);
	}
	double div(double x,double y)
	{
		return (x/y);
	}
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digits to perform all arithmetic operations");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Calci ci = new Calci();
		double s;
		s= ci.add(a,b);
		System.out.println ("the sum of (a + b):- "+a+ " + "+b+ " = "+s);
		s= ci.sub(a,b);
		System.out.println ("the subtraction of (a - b):- "+a+ " - "+b+ " = "+s);
		s= ci.muty(a,b);
		System.out.println ("the multiplication of (a * b):- "+a+ " * "+b+ " = "+s);
		s= ci.div(a,b);
		System.out.println ("the division of (a / b):- "+a+ " / "+b+ " = "+s);
	}
}