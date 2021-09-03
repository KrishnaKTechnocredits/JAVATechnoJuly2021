package neha.assignment_25;

/*Program2:
String str = "Ma1U2liK"
output : MUK12ali*/
public class Assignment25pg2 {
	String findCapitalSmallLettersNumbers(String str) {
		String capitalStr = "";
		String smallStr = "";
		String numStr = "";
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				capitalStr = capitalStr + String.valueOf(ch);
			if (Character.isDigit(ch))
				numStr = numStr + Character.getNumericValue(ch);
			if (Character.isLowerCase(ch))
				smallStr = smallStr + String.valueOf(ch);
		}
		return capitalStr + numStr + smallStr;
	}

	public static void main(String[] args) {
		Assignment25pg2 assignment25pg2 = new Assignment25pg2();
		String str = "Ma1U2liK";
		System.out.println("Output is: " + assignment25pg2.findCapitalSmallLettersNumbers(str));
	}

}
