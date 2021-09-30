package madhavi;

public class Assignment_41 {
	void printPattern(int row) {

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 != 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment_41 assignment_41 = new Assignment_41();
		System.out.println("Print pyramid pattern");
		assignment_41.printPattern(5);
	}
}