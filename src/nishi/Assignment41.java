/*Write a code to print below pattern.

*
##
***
####
******/

package nishi;

public class Assignment41 {
	void printPattern(int num)
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(i>=j)
				{
					if(i%2==0)
						System.out.print("*");
					else
						System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Assignment41().printPattern(5);
	}
}
