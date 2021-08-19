package avinash;
/*
 * *program 1*:  wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2
 * 
 */

public class EvenOddLength {

	int diff = 0;
	int evenSum = 0;
	int oddSum = 0;

	int differenceofNameLength(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int length = arr[index].length();
			if (length % 2 == 0) {
				evenSum = evenSum + length;
			} else {
				oddSum = oddSum + length;
			}
		}
		if (evenSum > oddSum) {
			diff = evenSum - oddSum;
		} else {
			diff = oddSum - evenSum;
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddLength evenOddLength = new EvenOddLength();
		String[] arr = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println("Difference between even length name and odd length name: "
				+ evenOddLength.differenceofNameLength(arr));

	}

}
