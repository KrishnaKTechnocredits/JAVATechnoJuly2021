package husain;

public class Assignment_14_Program4 {

	int maxOddNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] % 2 != 0) {
				if (arr[index] > max)
					max = arr[index];
			}
		return max;

	}

	int maxEvenNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] % 2 == 0) {
				if (arr[index] > max)
					max = arr[index];
			}
		return max;

	}

	void displayDifference() {
		int input[] = { 1, 11, 44, 23, 55, 99, 23 };
		int difference = 0;
		int maxOdd = maxOddNumber(input);
		int maxEven = maxEvenNumber(input);
		if (maxOdd > maxEven)
			difference = maxOdd - maxEven;
		else
			difference = maxEven - maxOdd;

		System.out.println("The difference between max odd and max even numbers of the given array is: " + difference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_14_Program4 obj = new Assignment_14_Program4();

		obj.displayDifference();

	}

}
