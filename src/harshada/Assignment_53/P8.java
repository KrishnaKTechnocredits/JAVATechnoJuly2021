/* 8. WAP to print below pattern
*
**
***
****
*****
****
***
**
*
*/

package harshada.Assignment_53;

public class P8 {
	
	void print() {
		
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P8().print();
	}

}
