package exp1;

import java.util.Scanner;
class Employee1
{
	double salary,gs,DA,HRA;
	Employee1(double salary, double DA, double HRA)
	{
		this.salary = salary;
		this.DA = DA;
		this.HRA = HRA;
	}
	void display()
	{
		System.out.println("...Employee...");
	}
	void calcSalary()
	{
		gs = salary+salary*(DA/100)+salary*(HRA/100);
		System.out.println("Gross Salary = "+gs);
	}
}

class Engineer extends Employee1
{
	Engineer(double salary, double DA, double HRA)
	{
		super(salary,DA,HRA);
	}
	void display()
	{
		super.display();
		super.calcSalary();
		System.out.println("...Engineer...");
	}
	void calcSalary()
	{
		System.out.println("Gross Salary of Engineer = "+gs*2);
	}
}

public class Overriding
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double salary,DA,HRA;
		System.out.println("Enter the basic salary of the Employee: ");
		salary = sc.nextDouble();
		System.out.println("Enter DA% of Employee: ");
		DA = sc.nextDouble();
		System.out.println("Enter HRA% of Employee: ");
		HRA = sc.nextDouble();
		
		Engineer e = new Engineer(salary,DA,HRA);
		e.display();
		e.calcSalary();
		sc.close();
	}
}
