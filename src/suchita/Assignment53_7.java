package suchita;
// Assignment 53_7

// pattern 7
public class Assignment53_7 {

	void printPattern(int rows) {
		
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int index = rows - 1; index >= 1; index--) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_7().printPattern(5);
	}

}