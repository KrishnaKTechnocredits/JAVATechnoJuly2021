package monali.Assignment_24;

public class MaxRepeatingword {

	/*
	 * Program 2 : Max repeating word with its freq. input : Hi Hello Hi Techno
	 * Hello Hi output : Hi -> 3
	 */

	static void getMaxRepeatingword(String input) {
		String arr[] = input.split(" ");
		int repeatCount = 0;
		String repeatString = "";
		for (int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int index1 = 0; index1 < arr.length; index1++) {
				if (arr[index].equals(arr[index1])) {
					count++;
				}
			}
			if (repeatCount < count) {
				repeatCount = count;
				repeatString = arr[index];
			}
		}
		System.out.println("Max Repeating word with its's frequency : " + repeatString + " " + repeatCount);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Hello Hi";
		getMaxRepeatingword(input);
	}

}
