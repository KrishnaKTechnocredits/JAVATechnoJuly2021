package manaswi;
public class Assignment_53_Program_8
 {

	public static void main(String[] args)
	{

		int row = 5;

		// upper
		for (int i = 1; i <= row; i++) 
		{
			for (int j = 1; j <= row - i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		// lower
		for (int i = row - 1; i >= 1; i--)
		{
			for (int j = 1; j <= row - i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}