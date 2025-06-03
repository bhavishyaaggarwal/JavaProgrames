import java.util.*;

class Parent 
{
    protected String fatherName;
    protected String motherName;
    protected int numberOfKids;
    public Parent(String fatherName, String motherName, int numberOfKids) 
    {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.numberOfKids = numberOfKids;
    }

    public void details() 
    {
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Number of Kids: " + numberOfKids);
    }
}

class Child extends Parent 
{
    private String childName;
    private int age;

    public Child(String fatherName, String motherName, int numberOfKids, String childName, int age) 
    {
        super(fatherName, motherName, numberOfKids);
        this.childName = childName;
        this.age = age;
    }

    public void details() 
    {
        super.details();
        System.out.println("Child's Name: " + childName);
        System.out.println("Age: " + age);
        System.out.println("Number of Siblings: " + (super.numberOfKids - 1));
    }
}

public class FamilyMain 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Father's Name: ");
        String fatherName = scanner.nextLine();
        System.out.print("Enter Mother's Name: ");
        String motherName = scanner.nextLine();
        System.out.print("Enter Number of Kids: ");
        int numberOfKids = scanner.nextInt();

        for (int i = 1; i <= numberOfKids; i++)
	{
            scanner.nextLine();
            System.out.println("\nEnter details for Child " + i + ":");
            System.out.print("Enter Child's Name: ");
            String childName = scanner.nextLine();
            System.out.print("Enter Child's Age: ");
            int age = scanner.nextInt();
            Child child = new Child(fatherName, motherName, numberOfKids, childName, age);
            System.out.println("\nDetails for Child " + i + ":");
            child.details();
        }
    }
}
