package shalaka.Assignment24;

public class MaxRepeatingWords {
	void getMaxRepeatingWords(String input) {
		String str[] = input.split(" ");
		int maxCount = 0;
		String maxCountWord = "";
		for (int index = 0; index < str.length; index++) {
			int count = 1;
			for (int index1 = index + 1; index1 < str.length; index1++)
				if (str[index].equals(str[index1])) {
					count++;
				}
			if (count > maxCount) {
				maxCount = count;
				maxCountWord = str[index];
			}
		}
		System.out.println(" Max repeating word is " + maxCountWord + " with its frequency " + maxCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi Hello Hi Techno Hello Hi";
		MaxRepeatingWords maxRepeatingWords = new MaxRepeatingWords();
		maxRepeatingWords.getMaxRepeatingWords(str);
	}

}
