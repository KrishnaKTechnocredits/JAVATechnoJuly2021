/*2. WAP to print below pattern
2. WAP to print below pattern
   * 
  * * 
 * * * 
* * * *
 
*/
package bhakti.Assignment_53;

public class Pattern_2 {
	
	public static void main(String[] args) {
		int n=4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
