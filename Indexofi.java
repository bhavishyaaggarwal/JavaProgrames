import java.util.*;
class Indexofi
{
	public static void main (String arg[])
	{
       		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the string in which you want to find the first and last occurrence of 'i':");
        	String s = sc.nextLine();
        	int a = s.indexOf("i");
        	int b = s.lastIndexOf("i");
        	System.out.println("The index of the first 'i' occurrence is: " + a);
        	System.out.println("The index of the last 'i' occurrence is: " + b);
    	}
} 