package suruchi;

public class Assignment19_Program3 {

	String getMinLengthWordInString(String str) {
		String minLengthWord = "";
		String[] arr = str.split(" ");
		int minLength = arr[0].length();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() < minLength) {
				minLength = arr[index].length();
				minLengthWord = arr[index];
			}
		}
		return minLengthWord;
	}

	public static void main(String[] args) {
		Assignment19_Program3 assignment19_Program3 = new Assignment19_Program3();

		String input = "good morning technocredits hi hello";
		System.out.println("String is as displayed: " + input);
		System.out.println();
		System.out.println(
				"Word with minimum length in the string is: " + assignment19_Program3.getMinLengthWordInString(input));
	}
}