package laxman;

public class Assignment17 {
	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String ans = assignment17.reverseString("technocredits");
		System.out.println(ans);

		
	}

}
