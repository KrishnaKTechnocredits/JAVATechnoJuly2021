/*14. WAP to print below pattern
A
A B
A B C
A B C D
A B C D E
A B C D E F*/
package nishi.Assignment53;

public class Pattern14 {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
			int x='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(Character.toChars(x++));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
