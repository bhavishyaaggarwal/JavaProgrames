import java.util.*;
class Countryarange
{
	public static void main (String arg[])
	{
       		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter the name of countries seprated by ',' :- ");
        	String s = sc.nextLine();
        	String[] a = s.split(",");
		System.out.println('\n'+"Countries arranged in alfabatical order is :- ");
        	for(int i=0 ; i<a.length; i++)
		{
			for (int j =i+1; j<a.length; j++)
			{
				if (a[j].compareTo(a[i]) < 0)
				{
					String t =a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.println(a[i]);
		}
    	}
}
