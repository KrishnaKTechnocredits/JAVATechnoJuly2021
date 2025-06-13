package suchita;
// Assignment 53_10

//pattern 10
public class Assignment53_10 {

	void printPatterns(int rows) {
		
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = rows; innerIndex >= index; innerIndex--)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_10().printPatterns(5);
	}

}