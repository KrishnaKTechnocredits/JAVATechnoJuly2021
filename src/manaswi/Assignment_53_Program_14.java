package manaswi;
/*A
A B
A B C
A B C D
A B C D E
A B C D E F*/
public class Assignment_53_Program_14 
{

	public static void main(String[] args)
	{
		int row = 5;
		for (int i = 0; i <= row; i++) 
		{
			for (int j = 65; j <= 65 + i; j++) 
			{
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}
}