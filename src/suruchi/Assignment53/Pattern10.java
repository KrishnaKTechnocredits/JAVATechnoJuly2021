package suruchi.Assignment53;

public class Pattern10 {

	public static void main(String[] args) {
		int k = 1;
		System.out.println("Pattern 10\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}