/*  * 
	* * 
	* * * 
	* * * * 
	* * * * * 
	* * * * 
	* * * 
	* * 
	* 
*/
package monika.Assignment_53;

public class Pattern_7 {
	public static void main(String[] args) {
		System.out.println("Pattern 7");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i =1; i<=4;i++) {
			for(int j=5-i; j>=1;j--)
				System.out.print("*");
			System.out.println();
		}
			
	}

}
