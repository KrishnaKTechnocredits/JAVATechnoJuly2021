package riten;

public class DiffrenceLengthName {
	int evenSum = 0;
	int oddSum = 0;
	int diff=0;

	void evenNames(String[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int index = 0; index < arr.length; index++) {
			// System.out.print(" "+arr[index]);

			int nameLen = (arr[index].length());

			if (nameLen % 2 == 0) {
				System.out.println("Even Names are: " + arr[index]);
				evenSum = evenSum + nameLen;
				evenCount++;
			} else {
				System.out.println("Odd Names are: " + arr[index]);
				oddCount++;
				oddSum = oddSum + nameLen;
			}

		}

		System.out.print("\nCount of Even names: " + evenCount + "\tAnd their length sum:" + evenSum);
		System.out.print("\nCount of Odd names: " + oddCount + "\tAnd their length:" + oddSum);
	}

	void diffOfEvenOddNames() {
		if(evenSum>oddSum){
		diff = evenSum - oddSum;
		}
		else {
			diff = oddSum - evenSum;
		}
		System.out.println("\n\nDifference of even length name and odd lenght name is: " + diff);
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Techno", "Nidhi", "Ankit" };
		DiffrenceLengthName d1 = new DiffrenceLengthName();
		d1.evenNames(input);
		d1.diffOfEvenOddNames();
	}
}