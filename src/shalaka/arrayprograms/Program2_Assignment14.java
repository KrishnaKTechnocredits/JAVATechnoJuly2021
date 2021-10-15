package shalaka.ArrayPrograms;

public class Program2_Assignment14 {

	int getminimumNumber() {
		int[] arr = { 1, 11, 44, 23, 55, 99, 23 };
		int minNumber = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNumber) {
				minNumber = arr[index];
			}
		}
		return minNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2_Assignment14 program2_Assignment14 = new Program2_Assignment14();
		int minNumber = program2_Assignment14.getminimumNumber();
		System.out.println("Minimum Number from given Array is: " + minNumber);

	}

}
