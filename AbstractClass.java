package exp1;

abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
	int side;
	Rectangle(int side)
	{
		this.side = side;
	}
	
	void numberOfSides() {
		System.out.println("Hi I am Rectangle, number of Sides = "+side);
	}
}

class Triangle extends Shape
{
	int side;
	Triangle(int side)
	{
		this.side = side;
	}
	void numberOfSides()
	{
		System.out.println("Hi I am Triangle, Number of Sides = "+side);
	}
}

class Hexagon extends Shape
{
	int side;
	Hexagon(int side)
	{
		this.side = side;
	}
	void numberOfSides()
	{
		System.out.println("Hi I am Hexagon, Number of Sides = "+side);
	}
}

public class AbstractClass {
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(4);
		Triangle t = new Triangle(3);
		Hexagon h = new Hexagon(6);
		
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
