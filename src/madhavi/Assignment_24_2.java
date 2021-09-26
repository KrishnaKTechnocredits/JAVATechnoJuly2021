package madhavi;

public class Assignment_24_2 {
	void getRepeatWord(String input) {
		String[] inputArray = input.split(" ");
		int totalCount = 0;
		String repWord = "";
		for (int i = 0; i < inputArray.length; i++) {
			int individualCount = 1;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j].equals(inputArray[i])) {
					individualCount++;
				}
			}
			if (totalCount < individualCount) {
				totalCount = individualCount;
				repWord = inputArray[i];
			}

		}
		System.out.println(repWord + "=>" + totalCount);
	}

	public static void main(String[] args) {

		Assignment_24_2 assignment_24_2 = new Assignment_24_2();
		String input = "Hi Hello Hi Techno Hello Hi";
		assignment_24_2.getRepeatWord(input);

	}
}