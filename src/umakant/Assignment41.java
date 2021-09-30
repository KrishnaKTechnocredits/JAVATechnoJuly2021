/*
Write a code to print below pattern 
*
##
***
####
*****
 */
package umakant;

public class Assignment41 {

	void pattern1(int rows) {
		for (int index = 1; index <= rows; index++) {
			String pattern;
			if (index % 2 == 1)
				pattern = "*";
			else
				pattern = "#";
			for (int innerindex = 1; innerindex <= index; innerindex++) {
				System.out.print(pattern);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment41().pattern1(10);
	}

}
