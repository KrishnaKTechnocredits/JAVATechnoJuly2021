package neha.assignment_53;
/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1  */
public class Program11 {
	void diplayPattern(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((rows-j)+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Program11().diplayPattern(5);
	}
}
