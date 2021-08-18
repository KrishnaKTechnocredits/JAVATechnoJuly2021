package husain;

public class Assignment_14_Program1 {

	int maxNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] > max)
				max = arr[index];
		return max;

	}

	void displayMaxNumber() {
		int input[] = { 1, 11, 44, 23, 55, 99, 23 };
		int number = maxNumber(input);
		System.out.println("The max number of the given array is: " + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_14_Program1 obj = new Assignment_14_Program1();

		obj.displayMaxNumber();

	}

}
