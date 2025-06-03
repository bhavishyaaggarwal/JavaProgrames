import java.util.*;
class Isprime
{	
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numder :");
		int a = sc.nextInt();
		int count=0;
		for (int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}	
		}
		if(count==1)
			System.out.println("the number is prime = "+a);
		else
			System.out.println("the number is not prime = "+a);
	}
}
