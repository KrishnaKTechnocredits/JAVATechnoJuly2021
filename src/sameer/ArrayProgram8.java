/*program 1*:  wap that will return difference of even length name and odd length name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";
output : 2*/
package sameer;

public class ArrayProgram8 {
	int diffOfEvenAndOddNameLength(String[] arr) {
		int diff = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			int ans = arr[index].length();
			if (ans % 2 == 0) {
				evenSum = evenSum + ans;
			} else
				oddSum = oddSum + ans;
		}
		if (evenSum > oddSum) {
			diff = evenSum - oddSum;
		} else {
			diff = oddSum - evenSum;
		}
		return diff;
	}

	public static void main(String[] args) {
		ArrayProgram8 arrayprogram8 = new ArrayProgram8();
		String[] arr = { "Maulik", "Techno", "Nidhi", "Ankit" };
		System.out.println("Difference between even length name and odd length name: "
				+ arrayprogram8.diffOfEvenAndOddNameLength(arr));
	}

}
