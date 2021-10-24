/*13. WAP to print below pattern
10101
01010
10101
01010
10101
*/

package bhakti.Assignment_53;

public class Pattern_13 {
	
	public static void main(String[] args) {
		int row=4;
		for(int i=1; i<=row; i++) {
			if (i%2!=0)
				System.out.println("10101");
			else
				System.out.println("01010");
		}
	}

}
