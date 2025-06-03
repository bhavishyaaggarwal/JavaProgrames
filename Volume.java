import java. util.*;
class Volume
{
	double cube(double x)
	{
		return (x*x*x);
	}
	double sphere(double x)
	{
		return ((4*Math.PI*x*x*x)/3);
	}
	double cylinder(double x,double y)
	{
		return (Math.PI*x*x*y);
	}
	double cone(double x,double y)
	{
		return ((Math.PI*x*x*y)/3);
	}
	public static void main (String are[])
	{
		double s;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose shape to calculate volume of shape frome menu"+'\n'+"1 = cube"+'\n'+"2 = Sphere"+'\n'+"3 = Cylinder"+'\n'+"4 = Cone");
		int choice =sc.nextInt();
		Volume vo = new Volume();
		switch (choice)
		{
			case 1:
				System.out.println("Enter the  size of edge :- ");
				double e = sc.nextDouble();
				s = vo.cube(e);
				System.out.println("Volume of cube edge size (" +e+ ") = "+s);
				break;
			case 2:
				System.out.println("Enter the  size of radius :- ");
				double r = sc.nextDouble();
				s = vo.sphere(r);
				System.out.println("Volume of sphere radius size (" +r+ ") = "+s);
				break;
			case 3:
				System.out.println("Enter the  size of radius and height :- ");
				r = sc.nextDouble();
				double h = sc.nextDouble();
				s = vo.cylinder(r,h);
				System.out.println("Volume of cylinder radius size (" +r+ ") and height size " +h+ ") = "+s);
				break;
			case 4:
				System.out.println("Enter the  size of radius and height :- ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				s = vo.cone(r,h);
				System.out.println("Volume of cone radius size (" +r+ ") and height size " +h+ ") = "+s);
				break;

			default:
				System.out.println("invalid choice");
		}
	}
}