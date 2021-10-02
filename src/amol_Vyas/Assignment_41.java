/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****
*/
package amol_Vyas;

public class Assignment_41 {

	static void assignment_41(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Assignment_41.assignment_41(5);
	}
}
