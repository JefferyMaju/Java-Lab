package exp1;
import java.util.Scanner;

class Area
{
	void area(double radius)
	{
		double ar = 3.14*radius*radius;
		System.out.print("Area of Circle = "+ar+"\n");
	}
	void area(double base, double height)
	{
		double ar = 0.5*base*height;
		System.out.print("Area of Traingle = "+ar+"\n");
	}
	void area(int length,int breadth)
	{
		int ar = length*breadth;
		System.out.print("Area of Rectangle = "+ar+"\n");
	}
}

public class MethodOverload {
	public static void main(String[] args) {
		int len,br;
		double r,base,height;
		
		try (Scanner sc = new Scanner(System.in)) {
			Area a = new Area();
			
			System.out.println("Enter the radius of the circle: ");
			r=sc.nextDouble();
			a.area(r);
			
			System.out.println("Enter the lenght and breadth of reactangle: ");
			len = sc.nextInt();
			br = sc.nextInt();
			a.area(len,br);
			
			System.out.println("Enter the base and height of the triangle: ");
			base = sc.nextDouble();
			height = sc.nextDouble();
			a.area(base,height);
		}
	}
}
