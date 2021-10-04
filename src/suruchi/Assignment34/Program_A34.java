package suruchi.Assignment34;

import java.util.Arrays;

public class Program_A34 {

	void findFirstNonRepeatingCharacter(String word) {
		char nonRepeatingChar = ' ';
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					&& word.indexOf(ch) == word.lastIndexOf(ch)) {
				nonRepeatingChar = ch;
				break;
			}
		}
		System.out.println("First non-repeating vowel character in the string is: " + nonRepeatingChar);
	}

	int findTripletCount(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2)
				count++;
		}
		return count;
	}

	void placeZeroAfterTripletAndDisplay(int[] arr) {
		int outputLength = arr.length + findTripletCount(arr);
		int[] output = new int[outputLength];
		int outputIndex = 0;
		int index = 0;
		while (index < arr.length) {
			if (index != arr.length - 1 && arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2) {
				output[outputIndex] = arr[index];
				output[outputIndex + 1] = arr[index + 1];
				output[outputIndex + 2] = arr[index + 2];
				output[outputIndex + 3] = 0;
				index += 3;
				outputIndex += 4;
			} else {
				output[outputIndex] = arr[index];
				index++;
				outputIndex++;
			}
		}
		System.out.println("Output array with zeros placed after triplet is: " + Arrays.toString(output));
	}

	void placeTripletSumAfterTripletAndDisplay(int[] arr) {
		int outputLength = arr.length + findTripletCount(arr);
		int[] output = new int[outputLength];
		int outputIndex = 0;
		int index = 0;
		int sum = 0;
		while (index < arr.length) {
			if (index != arr.length - 1 && arr[index + 1] == arr[index] + 1 && arr[index + 2] == arr[index] + 2) {
				output[outputIndex] = arr[index];
				output[outputIndex + 1] = arr[index + 1];
				output[outputIndex + 2] = arr[index + 2];
				sum = output[outputIndex] + output[outputIndex + 1] + output[outputIndex + 2];
				output[outputIndex + 3] = sum;
				index += 3;
				outputIndex += 4;
			} else {
				output[outputIndex] = arr[index];
				index++;
				outputIndex++;
			}
		}
		System.out.println("Output array with triplet sum placed after triplet is: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program_A34 assignment34 = new Program_A34();

		String input = "aqapquawrptirse";
		System.out.println("String is: " + input);
		assignment34.findFirstNonRepeatingCharacter(input);

		int[] arr = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println("\nArray is: " + Arrays.toString(arr));
		assignment34.placeZeroAfterTripletAndDisplay(arr);

		System.out.println();
		assignment34.placeTripletSumAfterTripletAndDisplay(arr);
	}
}