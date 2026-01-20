/*7. WAP to print below pattern
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

package bhakti.Assignment_53;

public class Pattern_7 {
	
	
	public static void main(String[] args) {
		int n=3;
		for (int i=1; i<=n; i++) {
			for (int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=n-1; i>0; i--) {
			for (int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
