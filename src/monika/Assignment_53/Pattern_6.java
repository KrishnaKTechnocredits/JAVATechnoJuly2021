/*
   	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
*/
package monika.Assignment_53;

public class Pattern_6 {
	public static void main(String[] args) {

		int rows=7;
		System.out.println("Pattern 6\n");
		for(int i=1; i<=rows-1; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=rows-1-i; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
