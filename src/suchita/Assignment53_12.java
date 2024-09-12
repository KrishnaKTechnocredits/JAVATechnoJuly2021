package suchita;
// Assignment 53_12

// pattern 12
public class Assignment53_12 {

	void printPatter(int rows) {
		
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=rows;innerIndex++) {
				if((index+innerIndex)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Assignment53_12().printPatter(5);
	}

}