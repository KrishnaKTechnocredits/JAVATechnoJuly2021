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
package shalaka.Assignment53;

public class Pattern4 {

	private static void pattern4(int row) {
		// upper part
		for (int i = 1; i <= row; i++) {
			for (int k = row - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("* ");
			}
			System.out.println();
		}
		// lower part
		for (int i = row - 1; i >= 1; i--) {
			for (int k = row - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern4(9);
	}

}
