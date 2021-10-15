package umakant.patterns;

public class Pattern11 {

	void printPatterns(int rows) {
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = rows; innerIndex >= index; innerIndex--)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern11().printPatterns(5);
	}

}
