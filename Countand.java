import java.util.*;
class Countand
{
	public static void main (String arg[])
	{
       		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter paragraph to count number of 'and' in it:");
        	String s = sc.nextLine();
        	String a[] = s.split(" ");
		int count =0;
        	for(int i=0 ;i<a.length ;i++)
		{
			if (a[i].equals("and"))
			count++;
		}
		System.out.println("The word 'and' appears " + count + " times in the paragraph.");
    	}
}