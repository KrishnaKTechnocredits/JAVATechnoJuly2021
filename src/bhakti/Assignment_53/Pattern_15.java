/*15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I

*/

package bhakti.Assignment_53;

public class Pattern_15 {
	
	public static void main(String[] args) {
		int row=3, n=1;
		char ch=65;
		for (int i=1; i<=row;i++) {
			 
			 System.out.print(n++);
			 System.out.print(ch++);
			 System.out.print(n++ );
			 System.out.print(ch++ );
			 System.out.print(n++ );
			 System.out.print(ch++ );
			 System.out.println();
		}
		
	}

}
