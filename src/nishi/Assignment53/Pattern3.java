/*3. WAP to print below pattern
       *
      * *
    * * *
  * * * *
* * * * *
* */
package nishi.Assignment53;

public class Pattern3 {
	void pattern3(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int k=1;k<=num-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Pattern3().pattern3(5);
	}
}
