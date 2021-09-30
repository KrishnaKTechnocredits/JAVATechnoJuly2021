package aniket;

import java.util.Scanner;

public class Assignment_41 {
	static void pattern(int row)
	{ 
		for(int i=1;i<=row;i++)
		{

			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
				System.out.print("#");
			}else
			{
				System.out.print("*");
			}
			}

			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows = scan.nextInt();
		pattern(rows);
	}
}

