package husain;

public class Assignment_15_Program3 {

	int differenceOfEvenAndOdd(int[] input) {
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenSum = evenSum + input[index];
			else
				oddSum = oddSum + input[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_15_Program3 obj = new Assignment_15_Program3();
		int[] arr = { 12, 2, 13, 9 };
		int output = obj.differenceOfEvenAndOdd(arr);
		System.out.print("The difference between sum of even number and sum of odd numbers in the given array ");
		for (int index = 0; index < arr.length; index++)
			System.out.print(arr[index] + ", ");
		System.out.print(" is: " + output);

		int[] arr1 = { 13, 22, 10, 3 };
		output = obj.differenceOfEvenAndOdd(arr1);
		System.out.print("\n\nThe difference between sum of even number and sum of odd numbers in the given array ");
		for (int index = 0; index < arr1.length; index++)
			System.out.print(arr1[index] + ", ");
		System.out.print(" is: " + output);
	}
}
