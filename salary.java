import java.util.*;

class salary 
{
    public static void main(String are[])
	{
		int fs,s,hra,da,ta=1000;
        	Scanner sc=new Scanner(System.in);
		System.out.println("enter the your salary:- ");
        	s=sc.nextInt();
		hra=(s*15)/100;
		da=(s*20)/100;
		fs=s+hra+da+ta;
		System.out.println("15% house rent allowance (HRA) "+hra);
		System.out.println("20% dearness allowance (DA) "+da);
		System.out.println("travelling allowance (TA) "+ta);
		System.out.println("final total salary = "+fs);		
	}
}