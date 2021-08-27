//Assignment 13;

package parthav;

public class ReturnFiveSmallerNumbers {

	int[] getFiveSmallerNumbers(int givenNumber, int howManySmallerNumbers) {
		int[] arr = new int[howManySmallerNumbers];
		int smallNumbervariable = 1;
		for (int index = 0; index < arr.length; index++) {
			arr[index] = givenNumber - smallNumbervariable;
			smallNumbervariable++;
		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println("-------------Program 1--------------------------------");

		CountOfPositiveNumbersInArray countObject = new CountOfPositiveNumbersInArray();
		int[] inputArr = { 1, -11, -44, 23, 55, -99, -23, -22 };
		System.out.println("The count of positive numbers in the array are: "
				+ countObject.getCountOfPositiveNumInArray(inputArr));

		System.out.println("-------------Program 2--------------------------------");

		CountZerosInArray countZerosInArray = new CountZerosInArray();
		int[] zerosInArray = { 1, -11, 0, 0, 55, 0, -23, 0 };
		System.out.println("The count of number of zeros in the array are: "
				+ countZerosInArray.getCountOfZerosInArray(zerosInArray));

		System.out.println("-------------Program 3--------------------------------");

		ReturnFiveSmallerNumbers returnObject = new ReturnFiveSmallerNumbers();
		int arr[] = returnObject.getFiveSmallerNumbers(50, 5);
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + ", ");
		}

	}

}
