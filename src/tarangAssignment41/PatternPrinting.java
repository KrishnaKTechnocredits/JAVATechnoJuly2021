package tarangAssignment41;
/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
***** */

public class PatternPrinting {

	// pattern1 *
	// **
	// ***
	// ****
	private void pattern1() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern2 1
	// 12
	// 123
	// 1234
	private void pattern2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				// System.out.println(i);
			}
			System.out.println();
		}
	}

	/*
	 * * ##
	 ***
	 * ####
	 */
	private void pattern3() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PatternPrinting p1 = new PatternPrinting();
		p1.pattern1();
		p1.pattern2();
		p1.pattern3();
	}
}