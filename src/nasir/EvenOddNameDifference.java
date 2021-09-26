/*wap that will return difference of even length name and odd lenght name.
arr[0] = "Maulik";
		
arr[1] = "Techno";
		
arr[2] = "Nidhi";
		
arr[3] = "Ankit";

output : 2*/

package nasir;

public class EvenOddNameDifference {

	int evenOddDifference(String[] arr) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0)
				evenSum += arr[index].length();
			else
				oddSum += arr[index].length();
		}
		return evenSum - oddSum;

	}

	public int processData() {
		String[] input = new String[4];
		input[0] = "Maulik";
		input[1] = "Techno";
		input[2] = "Nidhi";
		input[3] = "Ankit";
		return evenOddDifference(input);
	}

	public static void main(String[] args) {
		EvenOddNameDifference evenOddNameDifference = new EvenOddNameDifference();
		System.out.println(evenOddNameDifference.processData());

	}

}
