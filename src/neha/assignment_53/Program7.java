package neha.assignment_53;

/*
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
public class Program7 {
	void printPattern(int rows) {
		for (int i = 1; i <= rows/2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = (rows/2)+1 ; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program7().printPattern(9);
	}
}
