/*Program 2 : Max repeating word with its freq.
input : Hi Hello Hi Techno Hello Hi
output : Hi -> 3*/

package shraddha.Assignment24;

public class FrequencyOfMaxRepeatingWord {
	public static void main(String[] args) {
		String inputString = "Hi Hello Hi Techno Hello Hi";
		FrequencyOfMaxRepeatingWord newObject = new FrequencyOfMaxRepeatingWord();
		newObject.getMaxRepeatingWordAndFrequency(inputString);
	}

	void getMaxRepeatingWordAndFrequency(String inputString) {
		System.out.println("Input String is :- " + inputString);
		String[] strArray = inputString.split(" ");
		int maxCount = 0;
		String maxRepeatingString = "";

		for (int index = 0; index < strArray.length; index++) {
			int countOfRepetition = 0;
			for (int j = 0; j < strArray.length; j++) {
				if (strArray[index].equals(strArray[j])) {
					countOfRepetition++;
				}
			}
			if (countOfRepetition > maxCount) {
				maxCount = countOfRepetition;
				maxRepeatingString = strArray[index];
			}
		}
		System.out.println("Max repeating word in the above String is :- " + maxRepeatingString);
		System.out.println(" And it is repeating " + maxCount + " times");
	}

}
