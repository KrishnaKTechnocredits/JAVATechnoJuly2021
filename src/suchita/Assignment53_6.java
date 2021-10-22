package suchita;
// Assignment 53_6

// pattern 6
public class Assignment53_6 {
	
	void printPattern(int rows) {
		
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("* ");
			}
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_6().printPattern(5);
	}

}