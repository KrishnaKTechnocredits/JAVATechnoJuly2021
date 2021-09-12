package avinash.codingtest;

public class Nonrepeating {
	String findNonrepeating(String input) {
		char ch = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) == index) {
				ch = input.charAt(index);
				break;
			}
		}
		System.out.println("The first non-repeating character in " + input + " is " + ch);
		return input;

	}

	void nonRepeatingword(String input) {
		for (int index = 0; index < input.length(); index++) {
			String[] arr = input.split(" ");
			if (input.indexOf(arr[index]) == input.lastIndexOf(arr[index])) {
				System.out.println("first non repeating word is:" + arr[index]);
				break;
			}

		}

	}

	void countIncreasingTriplets(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] < input[index + 1] && input[index + 1] < input[index + 2]) {
				System.out.println("The triplet is :" + input[index] + "," + input[index + 1] + "," + input[index + 2]);
				count++;
			}

		}
		System.out.println("Total number of tripplets is:" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonrepeating nonrepeating = new Nonrepeating();
		String input = "technocredits";
		nonrepeating.findNonrepeating(input);
		String word = "hi this is techno gm credits this hi is ";
		nonrepeating.nonRepeatingword(word);
		int[] arr = { 10, 9, 11, 6, 23, 25, 22, 66, 34 };
		nonrepeating.countIncreasingTriplets(arr);

	}

}
