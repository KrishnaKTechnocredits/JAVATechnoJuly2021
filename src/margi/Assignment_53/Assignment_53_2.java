package margi.Assignment_53;

/*WAP to print below pattern 
    * 
   * * 
  * * * 
 * * * * 
* * * * *
*/

public class Assignment_53_2 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_2().pattern(5);
	}
}
