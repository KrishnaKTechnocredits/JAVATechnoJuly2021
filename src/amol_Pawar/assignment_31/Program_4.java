package amol_Pawar.assignment_31;

public class Program_4 {

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

	void getAllPerfectNum(int startIndex, int lastIndex) {
		System.out.println("Perfect number in given range " + startIndex + " and " + lastIndex + " is given below");
		for (int index = startIndex; index <= lastIndex; index++) {
			int output = getPerfectNum(index);
			if (output > 0)
				System.out.print(output + " ");
		}
	}

	public static void main(String[] args) {
		Program_4 program_4 = new Program_4();
		int startPoint = 40;
		int endPoint = 170;
		program_4.getAllPerfectNum(startPoint, endPoint);

	}

}
