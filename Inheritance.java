package exp1;
import java.util.Scanner;

class Employee
{
	String name;
	int age;
	long phonenumber;
	String address;
	float salary;
	Employee(String name1, int age1, long phonenumber1, String address1, float salary1)
	{
		name = name1;
		age = age1;
		phonenumber = phonenumber1;
		address = address1;
		salary = salary1;
	}
	
	void printEmployee()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone Number: "+phonenumber);
		System.out.println("Address: "+address);
	}
	
	void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
}

class Officer extends Employee
{
	String specialization;
	Officer(String name1, int age1, long phonenumber1, String address1, float salary1, String specialization1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		specialization = specialization1;
	}
	
	void printSpecialization()
	{
		System.out.println("Specialization: "+specialization);
	}
}

class Manager extends Employee
{
	String department;
	Manager(String name1, int age1, long phonenumber1, String address1, float salary1, String department1)
	{
		super(name1,age1,phonenumber1,address1,salary1);
		department = department1;
	}
	
	void printDepartment()
	{
		System.out.println("Department: "+department);
	}
}

public class Inheritance {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		long phonenumber;
		float salary;
		String name,address,specialization,department;
		
		System.out.println("Enter the details of the Officer:");
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		System.out.println("Enter the phone number: ");
		phonenumber = sc.nextLong();
		System.out.println("Enter the address: ");
		address = sc.next();
		System.out.println("Enter the salary: ");
		salary = sc.nextFloat();
		System.out.println("Enter the specialization: ");
		specialization = sc.next();
		
		Officer off = new Officer(name,age,phonenumber,address,salary,specialization);
		
		System.out.println("Enter the details of the Manager:");
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		System.out.println("Enter the phone number: ");
		phonenumber = sc.nextLong();
		System.out.println("Enter the address: ");
		address = sc.next();
		System.out.println("Enter the salary: ");
		salary = sc.nextFloat();
		System.out.println("Enter the department: ");
		department = sc.next();
		
		Manager m = new Manager(name,age,phonenumber,address,salary,department);
		
		System.out.println("\n");
		
		System.out.println("Details of the Officer: ");
		off.printEmployee();
		off.printSalary();
		off.printSpecialization();
		
		System.out.println("\n");
		
		System.out.println("Details of the Manager: ");
		m.printEmployee();
		m.printSalary();
		m.printDepartment();
		
		sc.close();
	}
}
