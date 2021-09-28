package margi.Assignment_41;

/*Write a code to print below pattern.
*
##
***
####
*****
--------*/

public class Assignment_41 {
	void getPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment_41 assignment_41 = new Assignment_41();
		assignment_41.getPattern(5);
	}
}
