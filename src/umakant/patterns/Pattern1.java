

package umakant.patterns;

public class Pattern1 {

	void printPattern(int rows) {
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern1().printPattern(5);
	}
}
