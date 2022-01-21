package neha.assignment_53;

/*	* * * * *
	* * * *
	* * *
	* *
	*     */
public class Program5 {
	void printPattern(int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program5().printPattern(5);
	}
}
