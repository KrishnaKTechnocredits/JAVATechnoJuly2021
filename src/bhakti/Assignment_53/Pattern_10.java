/*9. WAP to print below pattern
1 
2 3 
4 5 6 
7 8 9 10  

*/

package bhakti.Assignment_53;

public class Pattern_10 {
	
	public static void main(String[] args) {
		 
		int rows=7;
		int n=1;
		for (int i=1; i<=rows; i++) {
		
			for (int j=1; j<=i; j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}

}
