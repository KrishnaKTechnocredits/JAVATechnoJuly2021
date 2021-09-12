package mayur.ProgrammingTest6;

public class NonRepeatingWord {

	String nonRepeatingFirstWordInString(String input) {
		int count;
		String[] arr = input.split(" ");
		String firstWord = arr[0];
		String temp;
		for (int index = 0; index < arr.length; index++) {
			temp = arr[index];
			count = 0;
			for (int innerindex=0; innerindex < arr.length; innerindex++) {
				if (temp.equals(arr[innerindex]))
					count++;

			}
			if (count == 1) {
				firstWord = temp;
				break;
			}

		}

		return firstWord;
	}

	public static void main(String[] args) {
		NonRepeatingWord nonRepeatingWord = new NonRepeatingWord();
		String str = "hi this is techno gm credits this hi is";
		System.out.println("first non repeating word from a given String is : "
				+ nonRepeatingWord.nonRepeatingFirstWordInString(str));
	}

}
