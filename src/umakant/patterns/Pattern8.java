package umakant.patterns;

public class Pattern8 {
	void printPattern(int rows) {
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("* ");
			}
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int index = rows - 1; index >= 1; index--) {
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("* ");
			}
			for (int innerIndex = 1; innerIndex <= (rows - index); innerIndex++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern8().printPattern(5);
	}
}
