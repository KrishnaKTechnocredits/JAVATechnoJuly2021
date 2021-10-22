package suchita;
// Assignment 53_15

// pattern 15
public class Assignment53_15 {
	
	void printPatter(int rows) {
		for (int index = 1; index <= rows; index++) {
			char ch;
			if (index % 2 == 1)
				ch = 'A';
			else
				ch = 'a';
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Assignment53_15().printPatter(5);
	}

}