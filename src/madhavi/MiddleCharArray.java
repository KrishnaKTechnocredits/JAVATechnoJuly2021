package madhavi;

public class MiddleCharArray {

	char[] getMiddleCharFromArrayElement(String[] str) {

		char[] middleChar = new char[3];
		for (int index = 0; index < str.length; index++) {
			int i;
			i = str[index].length() / 2;
			middleChar[index] = str[index].charAt(i);
			

		}
		return middleChar;
	}

	public static void main(String[] args) {

		MiddleCharArray middleCharArray = new MiddleCharArray();

		System.out.println("Print middle char of all elements of the String array");
		String[] str = { "hello", "techno", "credits" };
		System.out.println(middleCharArray.getMiddleCharFromArrayElement(str));

	}
}