package suchita;
// Assignment 53_9

//pattern 9
public class Assignment53_9 {

	void printPatterns(int rows) {
		
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=index;innerIndex++)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		
		new Assignment53_9().printPatterns(5);
	}

}