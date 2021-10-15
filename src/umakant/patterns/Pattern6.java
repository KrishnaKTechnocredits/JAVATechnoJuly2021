package umakant.patterns;

public class Pattern6 {
	void printPattern(int rows) {
		for (int index = rows; index >= 1; index--) {
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
		new Pattern6().printPattern(5);
	}

}
