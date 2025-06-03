class Person {
    protected String name;
    protected String id;
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Student extends Person {
    private String sapId;
    private double result;
    public Student(String name, String id, String sapId, double result) {
        super(name, id);
        this.sapId = sapId;
        this.result = result;
    }
    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("SAP ID: " + sapId);
        System.out.println("Result: " + result);
    }
}

class Employee extends Person {
    private String department;
    private double grossSalary;
    public Employee(String name, String id, String department, double grossSalary) {
        // Call the constructor of the superclass (Person)
        super(name, id);
        this.department = department;
        this.grossSalary = grossSalary;
    }
    public void displayGrossSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Gross Salary: $" + grossSalary);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "S123", "12345", 85.5);
        Employee employee = new Employee("Jane Smith", "E456", "IT", 50000);
        System.out.println("Student Result:");
        student.displayResult();

        System.out.println("\nEmployee Gross Salary:");
        employee.displayGrossSalary();
    }
}
