/*9. WAP to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/

package nishi.Assignment53;

public class Pattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{			
				System.out.print(++count+" ");
			}
			System.out.println();
		}
	}
}
