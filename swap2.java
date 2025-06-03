import java.util.*;

class swap2 
{
    public static void main(String are[])
	{
		int a,b;
        	Scanner sc=new Scanner(System.in);
		System.out.println("enter the  first number :- ");
        	a=sc.nextInt();
		System.out.println("enter the second number :- ");
        	b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap first number= "+a);
		System.out.println("after swap second number= "+b);
	}
}