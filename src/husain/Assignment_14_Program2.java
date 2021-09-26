package husain;

public class Assignment_14_Program2 {

	int maxNumber(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++)
			if (arr[index] < min)
				min = arr[index];
		return min;

	}

	void displayMaxNumber() {
		int input[] = { 1, 11, 44, 23, 55, 99, 23 };
		int number = maxNumber(input);
		System.out.println("The min number of the given array is: " + number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_14_Program2 obj = new Assignment_14_Program2();

		obj.displayMaxNumber();

	}

}
