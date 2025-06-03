import java.util.*;
class Vehicle
{

	String vehicleName;
	String brand;
	String spas;

	Vehicle(String vehicleName, String brand ,String spas) 
	{
	        this.vehicleName = vehicleName;
	        this.brand = brand;
		this.spas = spas;
	}
	void display() 
	{
	        System.out.println("Vehicle Name: " + vehicleName);
	        System.out.println("Brand: " + brand);
		System.out.println("Specifications: " +spas);
	}
}
class Car extends Vehicle 
{
	String type;
	double price;
	double discount;
	double finalprice;
	Car(String vehicleName, String brand,String spas, String type, double price, double discount)
	{
		super(vehicleName,brand,spas);
		this.type = type;
		this.price = price;
		this.discount = discount;
	}
	void Finalprice()
	{
		double fp = price - (price*discount/100);
		this.finalprice = fp;
	}
	void display()
	{
		super.display();
		System.out.println("Type: " + type);
        	System.out.println("Price: $" + price);
        	System.out.println("Discount: " + discount + "%");
        	System.out.println("Final Price: $" + finalprice);
	}
}
class CarMain
{
	public static void main (String arg[])
	{
		Car c1 = new Car ("NEXON","TATA","5 star acidantel protection","SUV",1800000,15);
		c1.Finalprice();
		c1.display();
	}
}