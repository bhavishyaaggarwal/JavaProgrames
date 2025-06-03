import java.util.*;
class Worker
{
	String name;
	double hourlyRate;   
	Worker(String name, double hourlyRate)
	{
	        this.name = name;
	        this.hourlyRate = hourlyRate;
	}
	double ComPay (int hours)
	{
		return hours*hourlyRate;
	}
}
class DailyWorker extends Worker
{
	DailyWorker(String name, double hourlyRate) 
	{
		super(name, hourlyRate);
	}
	double ComPay(int hours) 
	{
	        return super.ComPay(hours);
	}
}
class SalariedWorker extends Worker 
{
	SalariedWorker(String name, double hourlyRate) 
	{
		super(name, hourlyRate);
	}
	double ComPay(int hours) 
	{
		if (hours >= 40)
		{
			return 	hourlyRate*40 ;
		}
		else
		{
			return super.ComPay(hours);
		}
	}
}
class WorkerMain
{
	public static void main (String arg[])
	{
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter name of daily worker:- ");
        	String s = sc.nextLine();
		System.out.println("Enter hour rate of daily worker :- ");
		double a = sc.nextDouble(); 
        	System.out.println("Enter name of salary worker:- ");
        	String t = sc.next();
		System.out.println("Enter hour rate of salary worker :- ");
		double b = sc.nextDouble();
		DailyWorker DW =new DailyWorker("s",a);		
		SalariedWorker SW =new SalariedWorker("t",b);
		System.out.println("Enter houres worked by daily worker:- ");
        	int x = sc.nextInt();
		System.out.println("Enter houres worked by salary worker :- ");
		int y = sc.nextInt();
		System.out.println("Daily Worker Pay: " + DW.ComPay(x));
        	System.out.println("Salaried Worker Pay: " + SW.ComPay(y)); 
	}
}





