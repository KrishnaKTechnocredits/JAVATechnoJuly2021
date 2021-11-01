package neha.assignment_53;

public class Program8 {
	void printPattern(int rows) {
		for (int i = 1; i <= rows + 1; i++) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= (rows - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Program8().printPattern(5);
	}
}
