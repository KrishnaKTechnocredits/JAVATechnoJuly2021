package suruchi;

public class Assignment19_Program1 {

	int getCountOfWordsInString(String str) {
		String[] arr = str.split(" ");
		int count = 0;
		for (int index = 0; index < arr.length; index++)
			count++;
		return count;
	}

	public static void main(String[] args) {
		Assignment19_Program1 assignment19_Program1 = new Assignment19_Program1();

		String input = "Hi Techno Credits Hello";
		System.out.println("String is as displayed: " + input);
		System.out.println();
		System.out.println("Count of words in a string is: " + assignment19_Program1.getCountOfWordsInString(input));
	}
}