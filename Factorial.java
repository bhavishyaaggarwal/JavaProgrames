import java.util.*;
class Factorial
{	
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end of the range :");
		int a = sc.nextInt();
		int b=1;
		for (int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{		
				b=b*j;
			}
			System.out.println("The factorial of "+i+" is - "+b);
			b=1;
		}
	}
}