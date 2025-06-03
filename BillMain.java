import java.util.*;
interface Bill 
{
	double discount();
	double finalBill();
}
class Grocery implements Bill 
{
	private double totalPrice;
	private double discount;	
	public Grocery(double totalPrice, double discount) 
	{
		this.totalPrice = totalPrice;
		this.discount = discount;
	}
	public double discount() 
	{
		return discount * totalPrice/100;
	}
	public double finalBill() 
	{
		return totalPrice - discount();
	}
}
class Fashion implements Bill 
{
	private double totalPrice;
	private double discount;
	public Fashion(double totalPrice, double discount) 
	{
		this.totalPrice = totalPrice;
		this.discount = discount;
	}
	public double discount() 
	{
		return discount * totalPrice/100;
	}
	public double finalBill() 
	{
		return totalPrice - discount();
	}
}
public class BillMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        	System.out.println("Enter total bill amount of Grocery Item ");
        	double a = sc.nextDouble();
		System.out.println("Enter discount on Grocery Item :- ");
		double b = sc.nextDouble();
		Grocery gi = new Grocery(a,b);
		System.out.println("Grocery Discount: $" + gi.discount());
		System.out.println("Final Grocery Bill: $" + gi.finalBill());

		System.out.println(); 
        	System.out.println("Enter total bill amount of Fashion Item ");
        	double c = sc.nextDouble();
		System.out.println("Enter discount on Fashion Item :- ");
		double d = sc.nextDouble();
		Fashion fi = new Fashion(c,d);
		System.out.println("Fashion Discount: $" + fi.discount());
		System.out.println("Final Fashion Bill: $" + fi.finalBill());
	}
}
