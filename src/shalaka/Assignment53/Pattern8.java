/*/*8. WAP to print below pattern
  *
 **
 ***
****
*****
****
 ***
 **
 *
 */
package shalaka.Assignment53;

public class Pattern8 {

	static void pattern8(int row) {
		for (int i = 1; i <= 5; i++) {
			for (int k = row - i; k >=1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = row - 1; i >= 1; i--) {
			for (int k = row-i; k >=1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern8(5);
	}

}
