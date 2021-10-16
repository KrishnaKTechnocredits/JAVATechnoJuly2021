package suruchi.Assignment53;

public class Pattern12 {

	public static void main(String[] args) {
		System.out.println("Pattern 12\n");
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j >= 1; j--)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}