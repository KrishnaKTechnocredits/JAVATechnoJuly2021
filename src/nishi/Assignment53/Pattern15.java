/*15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I*/

package nishi.Assignment53;

public class Pattern15 {
	public static void main(String[] args) {
		int count=1;
		int x='A';
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j%2!=0)
					System.out.print(count++);
				else
					System.out.print(Character.toChars(x++));
			}
			System.out.println();
		}
	}
}
