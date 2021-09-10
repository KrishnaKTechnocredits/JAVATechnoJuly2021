package siddharth;

public class Assignment25_2 {
	String changeString(String str) {
		String upperCase = "";
		String number = "";
		String lowerCase = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				upperCase += str.charAt(index);
			else if (Character.isDigit(str.charAt(index)))
				number += str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lowerCase += str.charAt(index);
		}
		return upperCase + number + lowerCase;
	}

	public static void main(String[] args) {
		Assignment25_2 assignment25_2 = new Assignment25_2();
		String str = "Ma1U2liK";
		System.out.println(assignment25_2.changeString(str));
	}
}
