/*9. WAP to print below pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/
package shalaka.Assignment53;

public class Pattern9 {
	static void pattern9(int row) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern9(5);
	}

}
