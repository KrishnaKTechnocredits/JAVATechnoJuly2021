package suruchi.Assignment53;

public class Pattern1 {

	public static void main(String[] args) {
		System.out.println("Pattern 1\n");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*" + " ");
			System.out.println();
		}
	}
}