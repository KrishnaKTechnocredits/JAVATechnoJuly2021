package suruchi;

public class Assignment15_Program3 {

	int getDifferenceBetweenSumEvenOddNumbers(int[] arr) {
		int evenSum = 0, oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];

		}
		return evenSum - oddSum;
	}

	public static void main(String[] args) {
		Assignment15_Program3 assignment15_Program3 = new Assignment15_Program3();

		int[] arr1 = { 12, 2, 13, 9 };
		int[] arr2 = { 13, 22, 10, 3 };

		System.out.println("Array of elements is as displayed: ");
		for (int index = 0; index < arr1.length; index++)
			System.out.print(arr1[index] + " ");
		System.out.println();
		int diff1 = assignment15_Program3.getDifferenceBetweenSumEvenOddNumbers(arr1);
		System.out.println("Difference between sum of even and odd numbers in the array is: " + Math.abs(diff1));

		System.out.println();
		System.out.println("Array of elements is as displayed: ");
		for (int index = 0; index < arr2.length; index++)
			System.out.print(arr2[index] + " ");
		System.out.println();
		int diff2 = assignment15_Program3.getDifferenceBetweenSumEvenOddNumbers(arr2);
		System.out.println("Difference between sum of even and odd numbers in the array is: " + Math.abs(diff2));
	}
}
