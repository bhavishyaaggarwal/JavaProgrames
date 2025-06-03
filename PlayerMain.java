import java.util.*;
class Player
{
	String name;
	int age;
	double weight;
	double height;
	Player(String name,int age,double weight,double height)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("height: " + height);
	}
}
class Cricket extends Player 
{
	String role;
	Cricket(String name,int age,double weight,double height,String role)
	{
		super(name,age,weight,height);
		this.role=role;
	}
	void display()
	{
		super.display();
		System.out.println("Role of player: " + role);
	}
}
class Football extends Player 
{
	String position;
	Football(String name,int age,double weight,double height,String position)
	{
		super(name,age,weight,height);
		this.position=position;
	}
	void display()
	{
		super.display();
		System.out.println("Position of player: " +position);
	}
}
class Hockey extends Player 
{
	String position;
	Hockey(String name,int age,double weight,double height,String position)
	{
		super(name,age,weight,height);
		this.position=position;
	}
	void display()
	{
		super.display();
		System.out.println("Position of player: " +position);
	}
}
class PlayerMain
{
	public static void main (String arg[])
	{
		Cricket c1 = new Cricket("Bhavishya",20,5.10,85,"All-rounder");
		Football f1 = new Football("Bhavishya",21,5.10,85,"Deffender");
		Hockey h1 =new Hockey("Bhavishya",22,5.10,85,"Forward");
		System.out.println('\n'+"output for Cricket player");
		c1.display();
		System.out.println('\n'+"output for Football player");
		f1.display();
		System.out.println('\n'+"output for Hockey player");
		h1.display();
	}
}