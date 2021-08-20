package shweta_Dharmadhikari.array_examples;

public class DifferenceOfEvenAndOddLengthName {

	int getEvenAndOddLengthName(String arr[]) {
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
		String arr[] = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		DifferenceOfEvenAndOddLengthName differenceOfEvenAndOddLengthName = new DifferenceOfEvenAndOddLengthName();
		System.out.println("Difference of even length name and odd lenght name is: "
				+ differenceOfEvenAndOddLengthName.getEvenAndOddLengthName(arr));
	}

}
