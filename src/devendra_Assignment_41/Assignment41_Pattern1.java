package devendra_Assignment_41;

public class Assignment41_Pattern1 {
	void printPattern(int row) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment41_Pattern1 obj = new Assignment41_Pattern1();
		obj.printPattern(8);		
	}
}

/*
Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.
*
##
***
####
***** 
*/