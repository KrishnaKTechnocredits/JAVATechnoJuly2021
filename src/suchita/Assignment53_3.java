package suchita;
// Assignment 53_3

//pattern 3
public class Assignment53_3 {
	
	void printPattern(int rows) {
		
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= rows - index; innerIndex++) {
				System.out.print(" ");
			}
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_3().printPattern(5);
	}

}