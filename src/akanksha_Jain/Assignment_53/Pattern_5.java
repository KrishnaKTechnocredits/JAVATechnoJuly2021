/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 5: WAP to print below pattern					
* * * * *
* * * *
* * *
* *					
*
*/

package akanksha_Jain.Assignment_53;

public class Pattern_5 {

	void printPattern(int rows) {
		for(int index=rows; index>=1; index--) {
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_5 pattern5 = new Pattern_5();
		pattern5.printPattern(5);
	}
}