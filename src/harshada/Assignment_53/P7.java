/* 
 
 7. WAP to print below pattern
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

package harshada.Assignment_53;

public class P7 {
	
	
 void print() {
	 
	for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P7().print(); 
	}

}
