/*14. WAP to print below pattern
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F*/

package astha.Assignment53;

public class Program14 {

	public static void main(String[] args) {
		System.out.println("Pattern 14\n");
		for (int i = 0; i <= 5; i++) {
			for (int j = 65; j <= 65 + i; j++)
				System.out.print((char) j + " ");
			System.out.println();
		}
	}
}
