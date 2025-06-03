import java.util.*;
class Wapper
{
	public static void main (String arg[])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Autoboxing: int to Integer to String");
		a=sc.nextInt();
		Integer b = Integer.valueOf(a);
		String c = b.toString();
		System.out.println("Primitive int: " + a);
		System.out.println("Integer object: " + b);
		System.out.println("String representation: " + c);
		System.out.println("Autoboxing: int to String");
		String d = Integer.toString(a);
		System.out.println("String representation: " + d);
		System.out.println('\n'+"Unboxing: String to int");
		System.out.println("Enter String ");
		String e = sc.next();
		int f = Integer.parseInt(e);
		System.out.println("Primitive int: " + f);
		System.out.println("Unboxing: Integer to int");
		System.out.println("Enter Integer ");
		int x = sc.nextInt();
		Integer g = Integer.valueOf(x);
		int h = g.intValue();
		System.out.println("Integer object: " + g);
        	System.out.println("Unboxed int: " + h);
	}
}