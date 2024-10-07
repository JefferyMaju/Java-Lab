package exp1;

class Animal 
{
	void Display()
	{
		System.out.println("The animal is:");
	}
}

class Cat extends Animal
{
	void Display1()
	{
		System.out.println("This is a cat");
	}
}

class Dog extends Animal
{
	void Display2()
	{
		System.out.println("This is a dog");
	}
}

public class Hierarchy {
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Dog d = new Dog();
		c.Display();
		c.Display1();
		d.Display();
		d.Display2();
	}
}
