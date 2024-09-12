package suchita;
// Assignment 53_1

// pattern 1
public class Assignment53_1 {

	void printPattern(int rows) {
		
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Assignment53_1().printPattern(5);
	}
}