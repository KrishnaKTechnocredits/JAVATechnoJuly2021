/*1. WAP to print below pattern
* 
* * 
* * * 
* * * *


*/

package bhakti.Assignment_53;

public class Pattern_1 {
	
	public static void main(String[] args) {
		for (int i=1; i <= 4;i++) {
			for (int j=0; j<i ;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
