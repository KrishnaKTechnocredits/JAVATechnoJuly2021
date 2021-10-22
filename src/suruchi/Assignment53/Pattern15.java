package suruchi.Assignment53;

public class Pattern15 {

	public static void main(String[] args) {
		int k = 1;
		int str = 'A';

		System.out.println("Pattern 15\n");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 != 0) {
					System.out.print(k);
					k++;
				} else {
					System.out.print((char) str);
					str++;
				}
			}
			System.out.println();
		}
	}
}