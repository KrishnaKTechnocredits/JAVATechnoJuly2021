/*11. WAP to print below pattern
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1

*/

package bhakti.Assignment_53;

public class Pattern_11 {
	
	public static void main(String[] args) {
		int rows=5;
		for (int i=1; i<= rows; i++) {
			int num=rows;
			for (int j=1; j<=i; j++) {
				System.out.print(num--+" ");
			}
			System.out.println();
		}
		
	}

}
