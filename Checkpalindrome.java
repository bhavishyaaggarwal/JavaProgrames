import java.util.Scanner;

	class Checkpalindrome
	{
		public static void main(String are[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numder :");
			int num = sc.nextInt();
			int temp,rev=0,x; 
			temp=num;
			while(num>0)
			{
				x=num%10;
				rev=(rev*10)+x;
				num=num/10;
			}
			if(rev==temp)
				System.out.println("number is a palindrome = "+temp);
			else
				System.out.println("number is not a palindrome = "+temp);
		}
	}
