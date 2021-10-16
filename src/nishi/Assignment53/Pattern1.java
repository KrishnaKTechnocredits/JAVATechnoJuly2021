/*1. WAP to print below pattern
*
* *
* * *
* * * * */
package nishi.Assignment53;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
