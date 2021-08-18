package suruchi;

public class Assignment15_Program1 {

	int getDifferenceOfNameLengths(String[] arr) {
		int evenSum = 0, oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				evenSum += arr[index].length();
			else
				oddSum += arr[index].length();

		}
		return evenSum - oddSum;

	}

	public static void main(String[] args) {
		Assignment15_Program1 assignment15_Program1 = new Assignment15_Program1();

		String[] arr = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println("Array of names is as displayed: ");
		for (int index = 0; index < arr.length; index++)
			System.out.println(arr[index]);

		int diff = assignment15_Program1.getDifferenceOfNameLengths(arr);
		System.out.println("Difference between even and odd length names of the array is: " + Math.abs(diff));
	}
}