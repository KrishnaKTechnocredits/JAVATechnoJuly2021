package margi.Assignment_53;

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

public class Assignment_53_4 {

	void pattern(int row) {
		// upper
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// lower
		for (int i = row - 1; i >= 1; i--) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_4().pattern(5);
	}
}