/*9. WAP to print below pattern
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5

*/

package bhakti.Assignment_53;

public class Pattern_9 {
	
	public static void main(String[] args) {
		int n= 1;
		int rows=7;
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
