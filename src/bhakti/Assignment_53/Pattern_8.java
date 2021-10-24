/*8. WAP to print below pattern

    * 
    ** 
   *** 
  * * * * 
 * * * * * 
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 


 */
package bhakti.Assignment_53;

public class Pattern_8 {
	
	public static void main(String[] args) {
	int n=6;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = n-1; i >0; i--) {
			for (int j = n-i; j >0 ; j--) {
				System.out.print(" ");
			}
			for (int k = i; k>0; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
