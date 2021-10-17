/*WAP to print below pattern
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
package vivek.Assignment53;

public class Assignment53_04 {

	static void pattern4() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int l = 1; l <= i - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_04.pattern4();
	}
}
