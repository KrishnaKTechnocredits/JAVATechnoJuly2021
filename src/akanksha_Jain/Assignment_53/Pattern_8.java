/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 8: WAP to print below pattern				
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/

package akanksha_Jain.Assignment_53;

public class Pattern_8 {

	void printPattern(int rows) {
		for(int index=1; index<=rows; index++) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int index=rows-1; index>=1; index--) {
			for(int index3=rows-index; index3>=1; index3--) {
				System.out.print(" ");
			}
			for(int index2=1; index2<=index; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern_8 pattern8 = new Pattern_8();
		pattern8.printPattern(5);
	}
}