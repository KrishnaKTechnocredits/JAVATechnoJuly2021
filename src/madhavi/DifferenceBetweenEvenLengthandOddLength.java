package madhavi;

public class DifferenceBetweenEvenLengthandOddLength {

	int getEvenOddLengthDifference(String[] arr) {
		int evenlength = 0;
		int oddlength = 0;

		for (int index = 0; index < arr.length; index++) {
			if ((arr[index].length()) % 2 == 0) {
				evenlength = evenlength + arr[index].length();
			} else {

				oddlength = oddlength + arr[index].length();
			}

		}
		return evenlength - oddlength;
	}

	public static void main(String[] args) {

		DifferenceBetweenEvenLengthandOddLength differenceBetweenEvenLengthandOddLength = new DifferenceBetweenEvenLengthandOddLength();

		System.out.println("Print difference between even length name and odd length name from given array");
		String[] arr = new String[4];
		arr[0] = "Maulik";

		arr[1] = "Techno";

		arr[2] = "Nidhi";

		arr[3] = "Ankit";

		System.out.println(differenceBetweenEvenLengthandOddLength.getEvenOddLengthDifference(arr));

	}
}
