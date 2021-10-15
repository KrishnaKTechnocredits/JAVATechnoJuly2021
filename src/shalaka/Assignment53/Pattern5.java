/*5. WAP to print below pattern
* * * * * 
* * * * 
* * * 
* * 
*
*/
package shalaka.Assignment53;

public class Pattern5 {

	private static void pattern5(int row) {
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern5(5);
	}

}
