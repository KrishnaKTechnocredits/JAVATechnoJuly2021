/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 6: WAP to print below pattern			
* * * * * 
 * * * *					
  * * * 
   * * 
    *
*/

package akanksha_Jain.Assignment_53;

public class Pattern_6 {

	void printPattern(int rows) {
		for(int index=rows; index>=1; index--) {
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
		Pattern_6 pattern6 = new Pattern_6();
		pattern6.printPattern(5);
	}
}