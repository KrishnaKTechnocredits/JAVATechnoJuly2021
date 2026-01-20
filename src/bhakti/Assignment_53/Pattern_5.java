
/*5. WAP to print below pattern
* * * * * 
* * * * 
* * * 
* * 
* 

*/

package bhakti.Assignment_53;

public class Pattern_5 {
	
	public static void main(String[] args) {
		int n=5;
		
		for (int i=n; i >=0; i--) {
			for (int j=i; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	

}
