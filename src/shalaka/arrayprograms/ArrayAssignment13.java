package shalaka.ArrayPrograms;

public class ArrayAssignment13 {

	int getCountOfPositiveNumbers() {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		int positiveNumerCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				positiveNumerCount++;
		}
		return positiveNumerCount;
	}

	int getCountNumberOfZeros() {
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		int zeroCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				zeroCount++;
		}
		return zeroCount;
	}

	int[] smallerNumber(int num) {
		int[] arr = new int[5];
		for (int index = 0; index < arr.length; index++) {
			num--;
			arr[index] = num;

		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAssignment13 arrayAssignment13 = new ArrayAssignment13();
		arrayAssignment13.getCountOfPositiveNumbers();
		System.out
				.println("Count of Positive Number From Given Array: " + arrayAssignment13.getCountOfPositiveNumbers());
		System.out.println("\nCount Number of Zero's From Given Array: " + arrayAssignment13.getCountNumberOfZeros());
		int[] smallerNumber = arrayAssignment13.smallerNumber(50);
		System.out.println("\n5 Smaller numbers of the given given number:");
		for (int index = 0; index < smallerNumber.length; index++) {
			System.out.print(smallerNumber[index] + " ");
		}

	}

}
