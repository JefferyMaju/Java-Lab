package exp1;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args)
	{
		int choice;
		char str='y';
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter your choice: 1.Arithmetic Operation  2.Array Access");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				int divisor,divide,result;
				System.out.println("Enter the number to be divided: ");
				divide = sc.nextInt();
				System.out.println("Enter the divisor: ");
				divisor = sc.nextInt();
				try
				{
					result = divide/divisor;
					System.out.println("Result is "+result);
				}
				catch (ArithmeticException e)
				{
					System.out.println("Caught an exception: "+e.getMessage());
				}
				finally
				{
					System.out.println("Finally...In the last block");
				}
				break;
			
			case 2:
				int[] a = {1,5,6,8,90};
				int index;
				System.out.println("Enter the index you want to access: ");
				index = sc.nextInt();
				try
				{
					System.out.println("The element is: "+a[index]);
				}
				catch(ArrayIndexOutOfBoundsException x)
				{
					System.out.println("Caught an exception: "+x.getMessage());
				}
				finally 
				{
					System.out.println("Finally...In the last block");
				}
				break;
			
			default:
				System.out.println("Invalid");
				break;
			}
			System.out.println("Do you want to continue: type y or n");
			str = sc.next().charAt(0);
		}
		while (str=='y' || str=='y');
		sc.close();
	}
}
