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
package shalaka.Assignment53;

public class Pattern7 {
	
	private static void pattern7(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern7(5);
	}

}
