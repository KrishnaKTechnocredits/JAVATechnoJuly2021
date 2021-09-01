package nasir_Assignment_24;

public class RepeatWordInString {
	void getMaxRepeatingWordInString(String input) {
		String[] arr = input.split(" ");
		int count;
		int maxFrequency = 0;
		String maxFreqWord = "";
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int index2 = 0; index2 < arr.length; index2++) {
				if (arr[index].equals(arr[index2])) {
					count++;
				}
				if (maxFrequency < count) {
					maxFrequency = count;
					maxFreqWord = arr[index];
				}
			}
		}
		System.out.println(
				"Maximum repeating word in the string is: " + maxFreqWord + " repeated " + maxFrequency + " times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatWordInString repeatWordInString = new RepeatWordInString();

		String input = "Hi Hello Hi Techno Hello Hi";
		System.out.println("String is as displayed: " + input);

		System.out.println();
		repeatWordInString.getMaxRepeatingWordInString(input);

	}

}
