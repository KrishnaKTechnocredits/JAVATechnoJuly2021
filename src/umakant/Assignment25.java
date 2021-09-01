package umakant;

public class Assignment25 {

	int getSumOfNumbersInString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			if (Character.isDigit(input.charAt(index))) {
				do {
					temp += input.charAt(index);
					index++;
				} while (index < input.length() && Character.isDigit(input.charAt(index)));
				sum += Integer.parseInt(temp);
			}
		}
		return sum;
	}

	String getSortedString(String input) {
		String upperCases = "", lowerCases = "", digits = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				upperCases += ch;
			else if (Character.isLowerCase(ch))
				lowerCases += ch;
			else if (Character.isDigit(ch))
				digits += ch;
		}
		return upperCases + digits + lowerCases;
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		System.out.println(assignment25.getSumOfNumbersInString("te12ch33no3credit4s"));
		System.out.println(assignment25.getSortedString("Ma1U2liK"));
	}

}
