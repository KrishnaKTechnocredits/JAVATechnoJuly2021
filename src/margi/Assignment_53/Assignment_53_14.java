package margi.Assignment_53;

/*WAP to print below pattern
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/

public class Assignment_53_14 {

	void pattern(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Assignment_53_14().pattern(6);
	}
}
