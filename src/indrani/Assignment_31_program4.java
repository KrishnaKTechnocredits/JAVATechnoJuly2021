package indrani;

public class Assignment_31_program4 {
	
	int getPerfectNum(int input) {
		int temp = input / 2;
		while (temp != 0) {
			if (temp * temp == input) {
				return input;
			}
			temp--;
		}
		return 0;
	}

	void getPerfectNumbersInRange(int startIndex, int lastIndex) {
	System.out.println("Perfect numbers in between " + startIndex + " and " + lastIndex + " are");
		for (int index = startIndex; index <= lastIndex; index++) {
			int output = getPerfectNum(index);
			if (output > 0)
				System.out.print(output + " ");
		}
	}

	public static void main(String[] args) {
		Assignment_31_program4 program4 = new Assignment_31_program4();
		program4.getPerfectNumbersInRange(40,170);

	}
}