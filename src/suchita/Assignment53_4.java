package suchita;
// Assignment 53_4

//Pattern 4
public class Assignment53_4 {

	void printPattern(int rows) {
		
		int totalRowElement = 2 * rows - 1;
		for (int index = 1; index <= rows; index++) {
			int numberOfStars = ( 2 * index - 1);
			for (int innerIndex = 1; innerIndex <= (totalRowElement - numberOfStars) / 2; innerIndex++) {
				System.out.print(" ");
			}
			for (int innerIndex = 1; innerIndex <= numberOfStars; innerIndex++) {
				System.out.print("*");
			}
			for (int innerIndex = 1; innerIndex <= (totalRowElement - numberOfStars ) / 2; innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Assignment53_4().printPattern(10);
	}

}