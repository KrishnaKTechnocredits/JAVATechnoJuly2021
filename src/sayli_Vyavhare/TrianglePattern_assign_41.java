/*
 Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
***** 
 */
package sayli_Vyavhare;

public class TrianglePattern_assign_41 {
	
	void getPatternPrinted(int num) {
		for (int index = 1; index <= num; index++) {

			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (index % 2 != 0) {
					System.out.print("*");
				} else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TrianglePattern_assign_41 pattern = new TrianglePattern_assign_41();
		pattern.getPatternPrinted(6);
	}
}
