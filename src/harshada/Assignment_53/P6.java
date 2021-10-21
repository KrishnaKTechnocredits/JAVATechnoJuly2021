/* 
 
6. WAP to print below pattern
* * * * *
* * * *
* * *
* *
*

*/
package harshada.Assignment_53;

public class P6 {

	void printPattern() {
		
		for(int i=5; i>=1; i--) {
			
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P6().printPattern();
	}

}
