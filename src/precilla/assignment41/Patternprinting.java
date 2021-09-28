/*
Pattern 
*
##
***
####
*****
*/

package precilla.assignment41;

public class Patternprinting {
	static void pattern(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}

}
