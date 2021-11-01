package neha.assignment_53;

/*
10101
01010
10101
01010
10101 */
public class Program13 {
	void diplayPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (j % 2 == 0 && i % 2 == 0)
					System.out.print(1);
				else if (j % 2 != 0 && i % 2 == 0)
					System.out.print(0);
				else if (j % 2 == 0 && i % 2 != 0)
					System.out.print(0);
				else if (j % 2 != 0 && i % 2 != 0)
					System.out.print(1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program13().diplayPattern(5);
	}
}
