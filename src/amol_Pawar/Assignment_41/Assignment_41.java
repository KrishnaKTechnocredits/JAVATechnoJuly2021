package amol_Pawar.Assignment_41;

public class Assignment_41 {

	void getPatternPrint(int input) {
		for (int index = 0; index <= input; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				if (index % 2 == 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Assignment_41 assignment_41 = new Assignment_41();
		assignment_41.getPatternPrint(5);

	}

}
/*
 * Assignment-41 : 28th Sep'2021 Write a code to print below pattern.
 *
 * 
 * ##
 ***
 * ####
 *****
 */