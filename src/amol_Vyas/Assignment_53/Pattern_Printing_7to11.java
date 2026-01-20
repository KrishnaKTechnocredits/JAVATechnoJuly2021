package amol_Vyas.Assignment_53;

public class Pattern_Printing_7to11 {

	static void printPattern7(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		for (int i = 1; i <= row - 1; i++) {
			for (int j = row - i; j >= 1; j--)
				System.out.print("* ");
			System.out.println();
		}
	}

	static void printPattern8(int row) {
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= row - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = row - 1; i >= 1; i--) {
			for (int k = row - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void printPattern9(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void printPattern10(int row) {
		int k = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

	static void printPattern11(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = row; j >= 6 - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Pattern 7");
		printPattern7(5);
		System.out.println("Pattern 8");
		printPattern8(5);
		System.out.println("Pattern 9");
		printPattern9(5);
		System.out.println("Pattern 10");
		printPattern10(5);
		System.out.println("Pattern 11");
		printPattern11(5);
		

	}

}
