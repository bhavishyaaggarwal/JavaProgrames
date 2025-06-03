class Student
{
	String name ;
	int rollno;
	Student (String name ,int rollno)
	{
		name=name;
		rollno=rollno;
	}
	void display()
	{
		System.out.println("name"+name+"rollno"+rollno);
	}

//class Main{//
    public static void main(String arg[]) 
	{
        	Student s1=new Student ("aman",101);
		Student s2=new Student ("naman",102);
		s1.display();
		s2.display();
	}
}