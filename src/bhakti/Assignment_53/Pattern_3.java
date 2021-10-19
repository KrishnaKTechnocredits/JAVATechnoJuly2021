/*3. WAP to print below pattern
    * 
  * * 
* * * 
 
 
 
*/
package bhakti.Assignment_53;

public class Pattern_3 {
	public static void main(String[] args) {
		int row=3;
		for (int i=1;i<=row; i++) {
			for (int k = 1; k <= 2* (row - i); k++) {
				System.out.print(" ");
			}
			for (int j=0; j< i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
