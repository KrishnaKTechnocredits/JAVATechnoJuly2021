package manaswi;
/*16. WAP to print below pattern
A
ab
ABC
abcd*/
public class Assignment_53_Program_16 
{

	public static void main(String[] args) 
	{

		for (int i = 0; i <= 3; i++)
		{
			for (int j = 65; j <= 65 + i; j++) 
			{
				if (i % 2 != 0)
					System.out.print((char) (j + 32));

				else
					System.out.print((char) j);

			}
			System.out.println();
		}
	}
}