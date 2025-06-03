import java.util.*;
class Digitsum
{	
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numder :");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = a;i!=0;i=i/10)
		{
			int b=i%10;
			sum=sum+b;
		}
		System.out.println("the sum of digits :"+sum);
	}
}
