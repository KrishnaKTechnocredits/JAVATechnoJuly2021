package madhavi;

public class Assignment_36 {
	void getSwapVowel(String str) {
		char[] ch = str.toCharArray();
		// for (int index = 0; index < str.length(); index++) {
		int firstindex = str.length();
		int lastindex = 0;
		char ftemp = 0;
		char ltemp = 0;
		for (int index = 0; index < ch.length - 1; index++) {
			if ((isVowel(ch[index]))) {
				if (firstindex > index) {
					firstindex = index;
					ftemp = ch[firstindex];
				}

				if (lastindex < index) {
					lastindex = index;
					ltemp = ch[lastindex];
				}
			}
		}
		ch[firstindex] = ltemp;
		ch[lastindex] = ftemp;
		// System.out.println(ch[firstindex] );
		// System.out.println(ch[lastindex] );
		System.out.println(ch);
	}

	static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Assignment_36 assignment_36 = new Assignment_36();
		String input = "amol";
		assignment_36.getSwapVowel(input);
	}
}