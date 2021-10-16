/*Pattern:1
	*  
	* *  
	* * *  
	* * * *   
*/
package monika.Assignment_53;

public class Pattern_1 {

	public static void main(String[] args) {
		
		System.out.println("Pattern 1\n");
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
