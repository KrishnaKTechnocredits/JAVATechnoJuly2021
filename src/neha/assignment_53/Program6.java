package neha.assignment_53;

public class Program6 {
	void printPattern(int rows) {
		for (int i = rows; i >= 1; i--) {
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
		Program6 program6 = new Program6();
		program6.printPattern(5);
	}
}
