/*4. WAP to print below pattern
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
package nishi.Assignment53;

public class Pattern4 {
	void pattern4(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		for(int i=num-1;i>=0;i--)
		{
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
	}
	public static void main(String[] args) {
		new Pattern4().pattern4(5);
	}
}
