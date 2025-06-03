import java.util.*;
class Countwordes
{
	public static void main (String arg[])
	{
       		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the string in which you want count numbers of wordes :");
        	String s = sc.nextLine();
        	String a[] = s.split(" ");
        	int b = a.length;
        	System.out.println("The numbers of wordes are : " + b);
    	}
}