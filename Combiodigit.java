import java.util.*;
class Combiodigit
{	
	public static void main (String are[])
	{
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numder :");
		String a = sc.next();
		System.out.println("all the possible combinations are:-");
		for(x=0;x<3;x++)
		{	
			for(y=0;y<3;y++)
			{
				for(z=0;z<3;z++)
				{
					if(x!=y&&y!=z&&z!=x)
					{
						System.out.println(a.charAt(x)+""+a.charAt(y)+""+a.charAt(z));
					}
				}
			}
		}
	}
}