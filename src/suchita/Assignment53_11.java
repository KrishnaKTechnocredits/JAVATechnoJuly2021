package suchita;
// Assignment 53_11

// Pattern 11
public class Assignment53_11 {

	void printPatterns(int rows) {
		
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = index; innerIndex >= 1; innerIndex--)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_11().printPatterns(5);
	}

}