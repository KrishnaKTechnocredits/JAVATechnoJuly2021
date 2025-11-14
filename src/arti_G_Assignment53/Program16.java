package arti_G_Assignment53;

public class Program16 {

	void printPattern(int rows) {
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
		new Program16().printPattern(5);
	}

}
