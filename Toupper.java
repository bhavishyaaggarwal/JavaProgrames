import java.util.*;
class Toupper
{
	public static void main (String arg[])
	{
       		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the string to converting into upper case :");
        	String s = sc.nextLine();
        	s=s.toUpperCase();        	
		System.out.println('\n'+"converted to upper case ......" + s);
    	}
}