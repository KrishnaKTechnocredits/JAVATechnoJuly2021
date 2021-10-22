package suruchi.Assignment53;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("Pattern 8\n");
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int k = 5 - i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}