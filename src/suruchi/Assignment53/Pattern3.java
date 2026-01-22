package suruchi.Assignment53;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Pattern 3\n");
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= 2*(5 - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}