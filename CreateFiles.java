package exp1;
import java.io.*;

public class CreateFiles {
	public static void main(String[] args)
	{
		try {
			File newfile = new File("filename2.txt");
			if (newfile.createNewFile())
				System.out.println("File successfully created: "+newfile.getName());
			else
				System.out.println("File already exists: "+newfile.getName());
		}
		
		catch (IOException e)
		{
			System.out.println("An error occured: ");
			e.getStackTrace();
		}
	}
}
