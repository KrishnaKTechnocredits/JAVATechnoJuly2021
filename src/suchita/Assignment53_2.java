package suchita;
// Assignment 53_2

// pattern 2
public class Assignment53_2 {
	
	void printPattern(int rows) {
		
		for (int index = 1; index <= rows; index++) {
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
		
		new Assignment53_2().printPattern(5);
	}

}