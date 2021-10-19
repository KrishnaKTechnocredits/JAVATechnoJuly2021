/* String str = "Ma1U2liK"
   output : MUK12ali
*/
package shyam;

public class RearrangementOfString {
	public static void main(String[] args) {
		RearrangementOfString newObject = new RearrangementOfString();
		System.out.println("Rearranged String will be like :- " + newObject.rearrangeTheString("Ma1U2liK"));

	}

	// method to rearrange the String as CapitalCaseLetters+numbers+smallCaseLetters
	
	String rearrangeTheString(String inputString) {
		
		String capitalCaseString = "";
		String smallCaseString = "";
		String digitString = "";
		System.out.println("Input String is :- " + inputString);

		for (int index = 0; index < inputString.length(); index++) {
			
			if (Character.isUpperCase(inputString.charAt(index)))
				capitalCaseString += inputString.charAt(index);
			
			if (Character.isLowerCase(inputString.charAt(index)))
				smallCaseString += inputString.charAt(index);
			
			if (Character.isDigit(inputString.charAt(index)))
				digitString += inputString.charAt(index);
		}
		return capitalCaseString + digitString + smallCaseString;
	}

}
