package avinash.codingtest;

public class CodingTest8 {

	int getCountNumber(int[] input, int number) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == number) {
				count++;
				input[index] = 0;
				
			}
		}

		return count;
	}

	void getCountPairofNumber(int[] input) {
		int count = 0, sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				count = getCountNumber(input, input[index]);
				if (count > 1) {
					sum += count / 2;

				}
			}
		}
		System.out.println("Sum of number of pair of Array is:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 3, 5, 6, 3, 5, 3, 7, 7, 8, 3, 3, 5, 8, 8 };
		CodingTest8 codingTest8 = new CodingTest8();
		codingTest8.getCountPairofNumber(input);

	}

}
