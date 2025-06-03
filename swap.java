import java.util.*;

class swap 
{
    public static void main(String are[])
	{
		int a,b,c;
        	Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first number :- ");
        	a=sc.nextInt();
		System.out.println("enter the second number :- ");
        	b=sc.nextInt();
        	c=a;
		a=b;
		b=c;
		System.out.println("after swap first number= "+a);
		System.out.println("after swap second number= "+b);
	}
}