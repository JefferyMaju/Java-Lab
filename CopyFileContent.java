package exp1;
import java.io.*;
import java.util.Scanner;

public class CopyFileContent {
	public static void main(String[] args)
	{
		try {
			FileInputStream fin = new FileInputStream("filename1.txt");
			FileWriter fin_enter = new FileWriter("filename1.txt");
			FileOutputStream fout = new FileOutputStream("filename2.txt");
			int i;
			Scanner sc = new Scanner(System.in);
			
			String arr;
			System.out.println("Enter the string to input to the first file: ");
			arr = sc.nextLine();
			fin_enter.write(arr);
			fin_enter.close();
			
			while ((i=fin.read()) != -1)
			{
				fout.write(i);
			}
			System.out.println("Successfully written on other file");
			fin.close();
			fout.close();
			sc.close();
		}
		
		catch (IOException e)
		{
			System.out.println("An error occured: ");
			e.getStackTrace();
		}
	}
}
