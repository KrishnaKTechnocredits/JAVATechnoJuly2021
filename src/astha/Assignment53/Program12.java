/*12. WAP to print below pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1*/

package astha.Assignment53;

public class Program12 {

	public static void main(String[] args) {
		System.out.println("Pattern 12\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
