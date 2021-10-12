package husain.Assignment53;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 4\n");

		for (int i = 1; i <= 9; i = i + 2) {
			for (int k = 1; k <= 5 - (i / 2); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 7; i >=1; i = i - 2) {
			for (int k = 5 - (i / 2); k >=1; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
