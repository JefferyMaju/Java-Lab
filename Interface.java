package exp1;
import java.util.Scanner;

interface Human
{
	void learn(String str);
	void work();
	static final int jobid = 1050;
}

interface Recruitment
{
	void screening(int score);
}

class Programmer implements Human,Recruitment
{
	public void learn(String str)
	{
		System.out.println("My trained area: "+str);
	}
	
	public void screening(int score)
	{
		System.out.println("Test Score: "+score);
	}
	
	public void work()
	{
		System.out.println("Selected to the Role Development");
	}
}

public class Interface {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int score;
		String str;
		System.out.println("Enter your trained area");
		str = sc.next();
		System.out.println("Enter Test Score");
		score = sc.nextInt();
		
		Programmer p = new Programmer();
		p.learn(str);
		p.screening(score);
		p.work();
		System.out.println("My Job's ID is: "+Human.jobid);
	}
}
