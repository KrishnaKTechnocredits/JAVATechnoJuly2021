/*Write a code to print below pattern.

*
##
***
####
*****
*/
package shantanu.patternPrinting_assignment41;

public class Pattern1 {
	void displayPattern(int rows) {
		for(int index = 1; index <= rows; index++) {
			for(int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if(index % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern1 pattern1 = new Pattern1();
		pattern1.displayPattern(5);
	}
}
