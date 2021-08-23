package madhavi;

public class Assignment_19_1 {
	int getStringWordCount(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == ' ') {
				count++;
			}
		}

		return ++count;
	}

	public static void main(String[] args) {
		Assignment_19_1 Assignment_19_1 = new Assignment_19_1();
		System.out.println("Print words count in a given statement:");
		String input = "Hi Techno Credits Hello";
		System.out.println(Assignment_19_1.getStringWordCount(input));

	}
}