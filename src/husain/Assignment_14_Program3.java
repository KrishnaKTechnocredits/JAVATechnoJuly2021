package husain;

public class Assignment_14_Program3 {

	int[] maxNumber(int[] arr) {
		int max = 0;
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
			if (arr[index] < min)
				min = arr[index];
		}
		int output[] = { max, min };
		return output;

	}

	void displayifference() {
		int input[] = { 1, 11, 44, 23, 55, 99, 23 };
		int[] number = maxNumber(input);
		int difference = number[0] - number[1];
		System.out.println("The difference between max and min numbers of the given array is: " + difference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_14_Program3 obj = new Assignment_14_Program3();

		obj.displayifference();

	}

}
