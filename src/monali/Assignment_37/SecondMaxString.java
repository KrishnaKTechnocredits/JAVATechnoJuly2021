package monali.Assignment_37;

public class SecondMaxString {

	String getSecondMaxString(String str) {
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].length() > words[j].length()) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
			// System.out.println(Arrays.toString(words));
		}
		return words[words.length - 2];
	}

	public static void main(String[] args) {
		SecondMaxString secondMaxStr = new SecondMaxString();
		String input = "Welcome to the family";
		String input2 = "Java is Object oriented Programming language";
		System.out.println("Second highest word in given string :--> " + secondMaxStr.getSecondMaxString(input));
		System.out.println("Second highest word in given string :--> " + secondMaxStr.getSecondMaxString(input2));
	}
}
