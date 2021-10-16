/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 1: WAP to print below pattern							
*
* * 
* * * 
* * * * 	
*/

package akanksha_Jain.Assignment_53;

public class Pattern_1 {
	
	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_1 pattern1 = new Pattern_1();
		pattern1.printPattern(4);
	}
}