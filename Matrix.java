package exp1;

import java.util.Scanner;
public class Matrix {
	public static void main(String[] args)
	{
		int r1,c1,r2,c2,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("First Matrix");
		System.out.println("Enter the no. of rows: ");
		r1 = sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		c1 = sc.nextInt();
		
		System.out.println("Second Matrix");
		System.out.println("Enter the no. of rows: ");
		r2 = sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		c2 = sc.nextInt();
		
		int a[][] = new int[r1][c1];
		int b[][] = new int[r2][c2];
		int c[][] = new int[r1][c2];
		
		// For entering the input of matrix
		System.out.println("For First Matrix");
		for (i=0;i<r1;i++)
		{
			System.out.println("For row "+(i+1));
			for (j=0;j<c1;j++)
			{
				System.out.println("Enter the element: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("For Second Matrix");
		for (i=0;i<r2;i++)
		{
			System.out.println("For row "+(i+1));
			for (j=0;j<c2;j++)
			{
				System.out.println("Enter the element: ");
				b[i][j] = sc.nextInt();
			}
		}
		
		// For showing the entered matrix
		System.out.println("First Matrix");
		for (i=0;i<r1;i++)
		{
			for (j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("Second Matrix");
		for (i=0;i<r2;i++)
		{
			for (j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		for (i=0;i<r1;i++)
		{
			for (j=0;j<c2;j++)
			{
				c[i][j]=0;
				for (k=0;k<c1;k++)
				{
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		
		System.out.println("The multiplied matrix is:");
		for (i=0;i<r1;i++)
		{
			for (j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
