/* Assignment - 53 : 11th oct'2021 Pattern Printing 	
Program 2: WAP to print below pattern			 					
    * 
   * * 
  * * *					
 * * * * 
* * * * *
*/

package akanksha_Jain.Assignment_53;

public class Pattern_2 {

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
	}
	
	public static void main(String[] args) {
		Pattern_2 pattern2 = new Pattern_2();
		pattern2.printPattern(5);
	}
}