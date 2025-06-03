import java.util.*;
class Fibonacci
{	
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till where serice is to be printed :");
		int a = sc.nextInt();
		int b=0,c=1,d;
		d=b+c;
		System.out.println(""+b);
		System.out.println(""+c);
		System.out.println(""+d);
		for (int i=1;i<=a;i=d)
		{
			b=c;
			c=d;
			d=b+c;
			if(d<=a)
			System.out.println(""+d);
		}
		
	}
}
