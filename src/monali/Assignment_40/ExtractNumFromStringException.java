package monali.Assignment_40;

public class ExtractNumFromStringException {

	void getNumberFromString(String str) {
		String[] words = str.split(" ");
		System.out.println("Number from given string are : " + str);
		for (int index = 0; index < words.length; index++) {
			try {
				System.out.println(Integer.parseInt(words[index]));
			} catch (NumberFormatException ne) {
				// System.out.println("Not a number");
			}
		}

	}

	public static void main(String[] args) {
		ExtractNumFromStringException extractNum = new ExtractNumFromStringException();
		String str1 = "I have 5 years and 3 months of exp";
		String str2 = "I have 15 years and 9 months of exp";
		extractNum.getNumberFromString(str1);
		extractNum.getNumberFromString(str2);
	}
}
