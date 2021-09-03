package trupti;

public class Assignment26_1 {

	public static void main(String[] args) {
		Assignment26_1 reverse = new Assignment26_1();
		String str = "This is technocredits";
		System.out.println("Input string:" + str);
		System.out.println("output reverse string:" + reverse.getReverseString(str));

	}

	String getReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		return output;
	}
}
