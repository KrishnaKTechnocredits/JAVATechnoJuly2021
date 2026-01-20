/*WAP to print below pattern
    *
   **
  ***
 ****
*****
*/

package vivek.Assignment53;

public class Assignment53_03 {

	static void pattern3() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment53_03.pattern3();
	}
}
