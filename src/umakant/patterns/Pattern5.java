package umakant.patterns;

public class Pattern5 {

	void printPattern(int rows) {
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern5().printPattern(8);
	}
}
