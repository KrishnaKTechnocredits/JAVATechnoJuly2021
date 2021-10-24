/*12. WAP to print below pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 

*/

package bhakti.Assignment_53;

public class Pattern_12 {
	public static void main(String[] args) {
		int rows=5;
		for (int i=1; i<= rows; i++) {
			
			for (int j=i; j>0; j--) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}

}
