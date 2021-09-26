//Coding Test 2 DATE: 08/30 Time Taken:35 mins
package deepak.CodingTest_2;

public class StringCaseChange {

	String caseChange(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				output = output + Character.toLowerCase(str.charAt(i));
			} else if (Character.isLowerCase(str.charAt(i))) {
				output = output + Character.toUpperCase(str.charAt(i));
			} else
				output = output + str.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
	
		StringCaseChange obj = new StringCaseChange();
		String input = "A1ashVi6";
		System.out.println("String entered for the Case Change phenomenon is: " + input);
		System.out.println("--------------------------------------------------------------");
		System.out.println("String after the Case Change phenomenon is: " + obj.caseChange(input));
		System.out.println("--------------------------------------------------------------");
	}

}
