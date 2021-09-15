package madhavi;

public class Coding_Test6_2 {

	void getFirstNonRepeatingWord(String input) {
		String[] inputArray = input.split(" ");
		String nonRepWord = "";

		for (int i = 0; i < inputArray.length; i++) {
			int individualCount = 1;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j].equals(inputArray[i])) {
					individualCount++;
				}
			}

			if (individualCount == 1) {
				nonRepWord = inputArray[i];
				break;
			}
		}
		System.out.println(nonRepWord);

	}

	public static void main(String[] args) {
		Coding_Test6_2 coding_Test6_2 = new Coding_Test6_2();
		String input = "hi this is techno gm credits this hi is";
		System.out.println("Find first non repeating Word from String: " + input);
		coding_Test6_2.getFirstNonRepeatingWord(input);
	}
}
