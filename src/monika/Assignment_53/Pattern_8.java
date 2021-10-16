/*   		  	* 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
			 * * * * 
			  * * * 
			   * * 
			    * 
   */
   package monika.Assignment_53;

public class Pattern_8 {
	public static void main(String[] args) {

	System.out.println("Pattern 8");
	for (int i = 1; i <= 5; i++) {

		for (int j= 1; j <= 5 - i; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
			System.out.print("*" + " ");
		}
		System.out.println();
	}
	for (int i = 4; i >= 1; i--) {

		for (int j = 5-i; j>= 1; j--) {
			System.out.print(" ");
		}
		for (int k= i; k >= 1; k--) {
			System.out.print("*" + " ");
		}
		System.out.println();
	}
	}
}
