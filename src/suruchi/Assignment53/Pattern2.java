package suruchi.Assignment53;

public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Pattern 2\n");
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}