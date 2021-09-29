/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.
*
##
***
####
*****
*/

package monika;

public class Assignment_41 {

	static void assignment_41(int row) {
		for (int index = 1; index <= row; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (index % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Assignment_41.assignment_41(6);
	}
}

