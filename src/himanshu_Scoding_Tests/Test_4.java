package himanshu_Scoding_Tests;

public class Test_4 {

	void shiftZeroMethod(int[] input) {

		int count = 0;
		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index]);
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };

		Test_4 ex = new Test_4();
		ex.shiftZeroMethod(input);
	}

}
