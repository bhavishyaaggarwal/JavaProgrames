import java. util.*;
class Tempconverter
{
	double x,y;
	double fera(double a)
	{
		return (((a*9)/5)+32);
	}
	double kelvin(double a)
	{
		return (a+273.15);
	}
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius");
		double a = sc.nextDouble();
		Tempconverter tc = new Tempconverter();
		double s;
		s= tc.fera(a);
		System.out.println ("the temperature in Fahrenheit is "+s);
		s=tc.kelvin(a);
		System.out.println ("the temperature in Kelvin is "+s);
	}
}