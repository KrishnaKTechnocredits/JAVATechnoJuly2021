package neha.assignment_53;

/*
A
A B
A B C
A B C D
A B C D E
A B C D E F  */
public class Program14 {
	void diplayPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				int ch = 'A' + j;
				System.out.print((char) ch + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program14().diplayPattern(6);
	}
}
