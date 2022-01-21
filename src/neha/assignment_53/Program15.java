package neha.assignment_53;

/*
1A2B3C
4D5E6F
7G8H9I  */
public class Program15 {
	void diplayPattern(int rows) {
		int tempDigit = 1;
		int tempChar = 'A';
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 2 * rows; j++) {
				if (j % 2 == 0) {
					System.out.print((char) tempChar);
					tempChar = tempChar + 1;
				} else {
					System.out.print(tempDigit);
					tempDigit++;

				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program15().diplayPattern(3);
	}
}
