import java.util.*;

class day 
{
    public static void main(String are[])
	{
		int day,y,m,re;
        	Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of days:- ");
        	day=sc.nextInt();
		y=day/365;
        	re=day%365;
		m=re/30;
		re=re%30;
		day=re;
		System.out.println("year = "+y);
		System.out.println("month = "+m);
		System.out.println("days = "+day);
	}
}