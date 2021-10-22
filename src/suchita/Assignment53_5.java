package suchita;
// Assignment 53_5

public class Assignment53_5 {

	void printPattern(int rows) {
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Assignment53_5().printPattern(8);
	}
}