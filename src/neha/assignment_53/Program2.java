package neha.assignment_53;

public class Program2 {
	void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		program2.printPattern(5);
	}
}
