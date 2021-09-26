package shalaka.arrayprograms;

public class ArrayAssignment14 {

	int getMaximumNumber() {
		int[] arr = { 1, 11, 44, 23, 55, 99, 23 };
		int maxNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNumber) {
				maxNumber = arr[index];
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayAssignment14 arrayAssignment14 = new ArrayAssignment14();
		int maxNumber = arrayAssignment14.getMaximumNumber();
		System.out.println("Maximum Number from given Array is: " + maxNumber);

	}

}
