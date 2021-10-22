package suchita;
// Assignment 53_13

//pattern 13
public class Assignment53_13 {

	void printPatter(int rows) {
		
		for(int index=1;index<=rows;index++) {
			char ch = 'A';
			for(int innerIndex=1;innerIndex<=index;innerIndex++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Assignment53_13().printPatter(5);
	}

}