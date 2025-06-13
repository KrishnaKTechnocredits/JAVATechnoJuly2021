/*6. WAP to print below pattern
 * * * * * 
 * * * * 
 * * * 
 * * 
 **/

package astha.Assignment53;

public class Program6 {

	public static void main(String[] args) {
		System.out.println("Pattern 6 \n");
		for (int i = 5; i >= 1; i--) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
