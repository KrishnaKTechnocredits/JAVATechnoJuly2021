package sushant;

public class LowerToUpper {
	String newString="";


	void convertString(String str) {
		String newString ="";

		for(int index = 0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index)) || str.charAt(index) == ' ')
				newString += str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				newString += Character.toUpperCase(str.charAt(index));
			else if(Character.isUpperCase(str.charAt(index)))
				newString +=Character.toLowerCase(str.charAt(index));
		}

		System.out.println("The new string with inverted value is: " +newString);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerToUpper lowerToUpper = new LowerToUpper();
		String str = "A1ashVi6";
		System.out.println("The given string is: " + str);
		lowerToUpper.convertString(str);

	}

}