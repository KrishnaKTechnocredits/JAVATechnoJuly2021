package suruchi.Assignment53;

public class Pattern9 {

	public static void main(String[] args) {
		System.out.println("Pattern 9\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}