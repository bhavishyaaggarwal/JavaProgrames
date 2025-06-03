import java.util.Scanner;

	class Possibility 
	{
		public static void main(String are[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numder :");
			int num = sc.nextInt();
			System.out.println("all the possible combinations are:-");
			int rev=0,x,a,b,c; 
			for(int i=0;i<3;i++ )
			{
				rev=0;
				System.out.println(""+num);
				while(num>0)
				{
					x=num%10;
					rev=(rev*10)+x;
					num=num/10;
				}
				System.out.println(""+rev);
				a=rev%100;
				b=a%10;
				c=a/10;
				a=rev/100;
				num=(a*100)+(b*10)+c;
			}
		}
	}
