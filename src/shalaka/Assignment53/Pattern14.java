/*14. WAP to print below pattern
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/
package shalaka.Assignment53;

public class Pattern14 {
	static void pattern14(int row) {
		for (int i = 1; i <= row; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern14(6);
	}

}
