import java.util.*;
class Pattern2
{	
	public static void main (String are[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row :");
		int a = sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			System.out.println("");
			for(int j=1;j<=i;j++)
			{		
				System.out.print(""+i);
			}
		}
	}
}