package manaswi;
public class Assignment_53_Program_11 
{
	public static void main(String[] args) 
	{
		int row=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=row+1-i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}