package umakant.patterns;

public class Pattern12 {
	
	void printPatterns(int rows) {
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = index; innerIndex >= 1; innerIndex--)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Pattern12().printPatterns(5);
	}

}
