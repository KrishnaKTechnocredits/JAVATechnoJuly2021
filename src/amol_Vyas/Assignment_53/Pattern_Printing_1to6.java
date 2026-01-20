package amol_Vyas.Assignment_53;

public class Pattern_Printing_1to6 {

	static void printPattern1(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void printPattern2(int row) {
		for (int i = 1; i <= row; i++) {
			for (int k = 1; k <= row - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	static void printPattern3(int row) {
		for (int i = 1; i <= row; i++) {

			for (int k = 1; k <= 2 * (row - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	static void printPattern4() {

		for (int i = 1; i <= 9; i = i + 2) {
			for (int k = 1; k <= 5 - (i / 2); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 7; i >= 1; i = i - 2) {
			for (int k = 5 - (i / 2); k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void printPattern5(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = row + 1 - i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void printPattern6(int row) {
		for (int i = row; i >= 1; i--) {
			for (int k = 1; k <= row - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Pattern 1");
		printPattern1(4);
		System.out.println("Pattern 2");
		printPattern2(5);
		System.out.println("Pattern 3");
		printPattern3(5);
		System.out.println("Pattern 4");
		printPattern4();
		System.out.println("Pattern 5");
		printPattern5(5);
		System.out.println("Pattern 6");
		printPattern6(5);

	}

}
