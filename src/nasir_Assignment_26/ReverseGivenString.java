package nasir_Assignment_26;

public class ReverseGivenString {
	

	String reverseString(String str) {
		char[] ch = str.toCharArray();
		String temp = "";
		for (int index = ch.length-1; index >= 0; index--) {
			temp += ch[index];
		}
		return temp;

	}

	public static void main(String[] args) {

		ReverseGivenString reverseGivenString = new ReverseGivenString();
		System.out.println("Print reverse of the String : ");
		String output = reverseGivenString.reverseString("This is technocredits");
		System.out.println("Output: "+ output );

	}

}
