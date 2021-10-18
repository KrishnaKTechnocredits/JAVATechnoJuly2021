package amol_Vyas.Assignment_53;

public class Pattern_Printing_12to16 {

	static void printPattern12(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}

	static void printPattern13(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				if (i % 2 != 0) {
					if (j % 2 == 0)
						System.out.print(0);
					else
						System.out.print(1);
				} else if (j % 2 == 0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
	}

	static void printPattern14(int row) {
		for (int i = 0; i <= row; i++) {
			for (int j = 65; j <= 65 + i; j++)
				System.out.print((char) j + " ");
			System.out.println();
		}
	}

	static void printPattern15() {
		int k = 1;
		int letter = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 != 0) {
					System.out.print(k);
					k++;
				} else {
					System.out.print((char) letter);
					letter++;
				}
			}
			System.out.println();
		}
	}

	static void printPattern16() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 65; j <= 65 + i; j++) {
				if (i % 2 != 0)
					System.out.print((char) (j + 32));
				else
					System.out.print((char) j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Pattern 12");
		printPattern12(5);
		System.out.println("Pattern 13");
		printPattern13(5);
		System.out.println("Pattern 14");
		printPattern14(5);
		System.out.println("Pattern 15");
		printPattern15();
		System.out.println("Pattern 16");
		printPattern16();
		

	}

}
