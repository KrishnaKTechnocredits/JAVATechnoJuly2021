/*3. WAP to print below pattern
         * 
       * * 
     * * * 
   * * * * 
 * * * * * 
*/
package shalaka.Assignment53;

public class Pattern3 {
	//static int row = 5;

	private static void pattern3(int row) {

		for (int i = 1; i <= row; i++) {
			for (int k =1; k<=row-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern3(5);
	}

}
