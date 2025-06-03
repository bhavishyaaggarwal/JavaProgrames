import java.util.*;

class smallesinthree 
{
    public static void main(String are[])
	{
		int a,b,c;
		System.out.println("entar the number to be compaired :- ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a<b)
        {
            if(a<c)
            System.out.println("a is smallest "+a);
        }
        else if (b<c)
        System.out.println("b is smallest "+b);
        else
        System.out.println("c is smallest "+c);
	}   
}
