package himanshu;

public class Assignment_14_Program3 {
	
	int max;
	int min;
	int difference;

	void maxNumber(int input[]) {
		max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (max < input[i]) {
				max = input[i];
			}
		}
		System.out.println(max);
	}

	void minNumber(int input[]) {
		min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (min > input[i]) {
				min = input[i];
			}
		}
		System.out.println(min);
	}

	void differenceBtwMaxMin() {
		difference = max - min;
		System.out.println("Difference between Maximum & Minimum Numbers:" + difference);
	}

	public static void main(String[] args) {

		int[] input = { 1, 11, 44, 23, 55, 99, 23 };

		Assignment_14_Program3 program3 = new Assignment_14_Program3();
		program3.maxNumber(input);
		program3.minNumber(input);
		program3.differenceBtwMaxMin();
	}
}


