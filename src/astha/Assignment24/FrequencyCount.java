/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package astha.Assignment24;

public class FrequencyCount {

	void getMaxRepeatedWord(String userInput) {
		String[] input = userInput.split(" ");
		int maxFrequency = 0;
		String maxRepeatedWord = " ";
		for (int index = 0; index < input.length; index++) {
			int lastIndex = input.length - 1;
			int frequency = 0;
			String[] splitArray = userInput.split(input[index]);
			if (input[index].equals(input[lastIndex]))
				frequency = splitArray.length;
			else
				frequency = (splitArray.length) - 1;
			if (frequency > maxFrequency) {
				maxFrequency = frequency;
				maxRepeatedWord = input[index];
			}
		}
		System.out.println("Max Repeated Word is : " + maxRepeatedWord + " with a frequency of : " + maxFrequency);

	}

	public static void main(String[] args) {
		FrequencyCount frequencyCount = new FrequencyCount();
		String input = "Hi Hello Hi Techno Hello Hi";
		frequencyCount.getMaxRepeatedWord(input);
	}

}
