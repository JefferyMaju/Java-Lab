import java.util.Scanner;
public class Freq
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character: ");
		String ch = sc.nextLine();
		int len = str.length();
		for (int i=0;i<len;i++)
		{
			if (str.charAt(i)==ch.charAt(0))
				count++;
		}
		System.out.println("Count ="+count);
	}
}

