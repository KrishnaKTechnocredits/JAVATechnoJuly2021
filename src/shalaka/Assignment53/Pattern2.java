/*2. WAP to print below pattern
     * 
    * *
   * * * 
  * * * * 
 * * * * *
*/
package shalaka.Assignment53;

public class Pattern2 {
	static int row=5;
	private static void pattern2() {
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern2();
	}

}
