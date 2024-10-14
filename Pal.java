import java.util.Scanner;
public class Pal
{
	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int len = str.length();
		for (int i=0;i<len;i++)
		{
			if (str.charAt(i)!=str.charAt(len-i-1))
			{
				flag = 1;
				break;
			}
		}
		
		if (flag==0)
		{
			System.out.println("Palindrome\n");
		}
		
		else
			System.out.println("Not Palindrome\n");
	}
}
