package monali.Assignment_53;

public class Program7 {

	public static void main(String[] args) {
		int row = 5;
		// upper

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// lower
		for (int i = row - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
