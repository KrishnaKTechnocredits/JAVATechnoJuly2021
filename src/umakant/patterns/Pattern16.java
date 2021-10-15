package umakant.patterns;

public class Pattern16 {
	void printPatter(int rows) {
		for (int index = 1; index <= rows; index++) {
			char ch;
			if (index % 2 == 1)
				ch = 'A';
			else
				ch = 'a';
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern16().printPatter(5);
	}

}
