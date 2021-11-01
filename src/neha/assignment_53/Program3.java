package neha.assignment_53;

/*	*
   **
  ***
 ****
*****   */
public class Program3 {
	void diplayPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		program3.diplayPattern(5);
	}
}
