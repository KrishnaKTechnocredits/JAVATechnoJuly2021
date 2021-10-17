package arti_G_Assignment53;

public class Program11 {

	void printPattern(int rows) {
		for (int index = rows; index >= 1; index--) {
			for (int innerIndex = rows; innerIndex >= index; innerIndex--)
				System.out.print(innerIndex);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Program11().printPattern(5);
	}

}
