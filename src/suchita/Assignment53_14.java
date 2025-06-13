package suchita;
// Assignment 53_14

// pattern 14
public class Assignment53_14 {
	
	void printPatter(int rows) {
		char ch = 'A';
		int num =1;
		for(int index=1;index<=rows;index++) {
			for(int innerIndex=1;innerIndex<=6;innerIndex++) {
				if(innerIndex%2==1)
					System.out.print(num++);
				else
					System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		new Assignment53_14().printPatter(5);
	}
}