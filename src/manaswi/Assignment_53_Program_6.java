package manaswi;
public class Assignment_53_Program_6 
{

	public static void main(String[] args)
	{

		int row=5;

		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}