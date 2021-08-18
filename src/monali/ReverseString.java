package monali;

public class ReverseString {

	String getReverseString(String str) {

		String reverseStr = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseStr += str.charAt(index);
		}
		return reverseStr;
	}

	String processData() {
		String str = "Technocredits";
		return getReverseString(str);
	}

	void displayReverseString() {
		System.out.println("Technocredits reverse string is :--> "+processData());
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.displayReverseString();
	}

}
