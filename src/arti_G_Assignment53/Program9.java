package arti_G_Assignment53;

public class Program9 {

	void printPattern(int rows) {
		for (int index = 1; index <= rows; index++) {
			for (int innerIndex = 1; innerIndex <= index; innerIndex++) {
				System.out.print(innerIndex);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Program9().printPattern(5);
	}

}
