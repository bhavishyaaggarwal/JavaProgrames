import java. util.*;
class Student
{
	String name ;
	int rollno;
	float marks[]=new float[3];
	double avm;
	String result;
	Student (String name ,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<3;i++)
			{
				System.out.println("Enter Subject "+(i+1)+" Marks  ");
				marks[i]=scanner.nextFloat();
			}
	}
	void avmaks()
	{
		double tm=0 ;
		int count = 0;
		for(int i=0;i<3;i++)
		{
			if (marks[i]>=35)
			{
				tm += marks[i];
				count++;
			}
		}
		if (count==3)
		{
			this.avm=tm/3;
			this.result="Pass";
		}
		else
		{
			this.result="Fail";
		}
		
	}
	void display()
	{
		System.out.println("Name = "+this.name +'\n'+ "Roll No = "+this.rollno +'\n'+"Avrage marks ="+this.avm +'\n'+"Rsult = "+this.result);
	}
}
class StudentMain{
    public static void main(String arg[]) 
	{
		Scanner sc = new Scanner(System.in);
		int tnos,rn;
		String n;
		System.out.println("Enter Total No Of Students ");
		tnos=sc.nextInt(); 
		Student s[]=new Student[tnos];
		for (int i = 0;i<tnos;i++ )
		{
			System.out.println("");
			System.out.println("Enter Roll Number of " +(i+1) +" Student");
			rn=sc.nextInt();
			System.out.println("Enter Name of " +(i+1) +" Student");
			n=sc.next();
			s[i]=new Student(n,rn);
		}
		for (int i = 0;i<tnos;i++ )
		{
			s[i].avmaks();
		
		}
		for (int i = 0;i<tnos;i++ )
		{
			System.out.println("");
			System.out.println("Student " +(i+1));
			s[i].display();
		
		}
	}
}