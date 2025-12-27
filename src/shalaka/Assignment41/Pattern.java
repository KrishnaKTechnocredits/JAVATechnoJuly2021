/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
*****
*/
package shalaka.Assignment41;

public class Pattern {
	static void pattern(int row) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%2==0)
				System.out.print("# ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
