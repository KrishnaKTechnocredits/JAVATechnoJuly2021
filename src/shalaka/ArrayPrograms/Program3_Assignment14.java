package shalaka.arrayprograms;

public class Program3_Assignment14 {

	int getDiffOffMinimumAndMaximumNumber() {
		int[] arr = { 1, 11, 44, 23, 55, 99, 23 };
		int minNumber = arr[0];
		int maxNumber = arr[0];
		int diffOfMinAndMax;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNumber)
				minNumber = arr[index];
			for (int i = 0; i < arr.length; i++) {
				if (arr[index] > maxNumber)
					maxNumber = arr[i];
			}

		}
		return diffOfMinAndMax = maxNumber - minNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3_Assignment14 program_Assignment14 = new Program3_Assignment14();
		int differenceOfMinAndMax = program_Assignment14.getDiffOffMinimumAndMaximumNumber();
		System.out.println("Difference Between Maximum And Minimum Number from given Array is: " + differenceOfMinAndMax);

	}

}
