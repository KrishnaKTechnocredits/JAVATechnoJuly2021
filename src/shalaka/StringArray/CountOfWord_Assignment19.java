package shalaka.StringArray;

public class CountOfWord_Assignment19 {
	int getCountOfWord(String input) {
		// int count = 0;
		String[] arr = input.split(" ");
		// for (int index = 0; index < arr.length; index++) {
		// count++;
		// }
		return arr.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hi Techno Credits Hello";
		CountOfWord_Assignment19 countOfWord_Assignment19 = new CountOfWord_Assignment19();
		int output = countOfWord_Assignment19.getCountOfWord(input);
		System.out.println("The count of words in statement are: " + output);
	}
}
