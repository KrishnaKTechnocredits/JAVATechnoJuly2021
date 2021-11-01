package neha.assignment_53;

/*
A
ab
ABC
abcd    */
public class Program16 {
	void diplayPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < i; j++) {
				if (i % 2 == 0) {
					int ch = 'a' + j;
					System.out.print((char) ch);
				} else {
					int ch = 'A' + j;
					System.out.print((char) ch);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program16().diplayPattern(4);
	}
}
