package neha;

/*Program 2: Find first non repeating word from a given String. [expected : 15 mins, actual = 10 min]
input : hi this is techno gm credits this hi is 
output : techno*/
public class NonRepeatingWordCodingTest6 {
	Boolean checkIfWordIsNonRepeating(String word, String[] arr) {
		int wordFreq = 0;
		for (int index = 0; index < arr.length; index++) {
			if (word.equals(arr[index]))
				wordFreq++;
		}
		if (wordFreq == 1)
			return true;
		else
			return false;
	}

	void findAndDisplayFirstNonRepeatingWord(String str) {
		String[] strArr = str.split(" ");
		String nonRWord = " ";
		for (int i = 0; i < strArr.length; i++) {
			if (checkIfWordIsNonRepeating(strArr[i], strArr)) {
				nonRWord = strArr[i];
				break;
			}
		}
		System.out.println("First non repeating word--> " + nonRWord);
	}

	public static void main(String[] args) {
		NonRepeatingWordCodingTest6 nonRepeatingWord = new NonRepeatingWordCodingTest6();
		String input = "hi this is techno gm credits this hi is";
		nonRepeatingWord.findAndDisplayFirstNonRepeatingWord(input);
	}

}
