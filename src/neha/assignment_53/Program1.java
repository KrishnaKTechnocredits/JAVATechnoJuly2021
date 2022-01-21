package neha.assignment_53;

/*	*
	* *
	* * *
	* * * *    */
public class Program1 {
	void diplayPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0 ; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();
		program1.diplayPattern(4);
	}
}
