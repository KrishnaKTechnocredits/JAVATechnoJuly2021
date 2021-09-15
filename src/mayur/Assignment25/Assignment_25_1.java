/*
 * Program2:
String str = "Ma1U2liK"
output : MUK12ali
 */
package mayur.Assignment25;

public class Assignment_25_1 {
	
	void getStringInOrder(String input) {
		String upperString = "";
		String lowerString = "";
		String num = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperString = upperString + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerString = lowerString + ch;
			} else if (Character.isDigit(ch)) {
				num = num + ch;
			}
		}
		System.out.println("Output of Program 2 is : " + upperString + num + lowerString);
	}

	public static void main(String[] args) {
		Assignment_25_1 assignment_25_1 = new Assignment_25_1();
		assignment_25_1.getStringInOrder("Ma1U2liK");

	}
}
	

	