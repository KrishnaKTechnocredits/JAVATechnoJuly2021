/*
 * Write a code to print below pattern.

*
##
***
####

 */

package bhagyashree;

import amol_Vyas.Assignment_41;

public class Assignment41 {

	void printPattern(int rowNum)
	{
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		
		Assignment41 ass41=new Assignment41();
		ass41.printPattern(5);
	}
}
