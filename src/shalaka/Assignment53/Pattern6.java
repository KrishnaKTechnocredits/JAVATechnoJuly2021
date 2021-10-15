/*6. WAP to print below pattern
 * * * * * 
  * * * * 
   * * * 
    * * 
     *
 */
package shalaka.Assignment53;

public class Pattern6 {
	
	private static void pattern6(int row) {
		for(int i=row;i>=1;i--) {
			for(int k=row-i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern6(5);
	}

}
