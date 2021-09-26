package genius;

public class ProgrammingTest2 {
	
	String convertLowCaseToUppCaseAndUppCaseToLowCase(String input) {
		String output = "";
		for(int index=0; index<input.length();index++) {
			
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				output = output + ch;
			}
			if(Character.isUpperCase(ch)) {
				char lowerCase = Character.toLowerCase(ch);
				output = output + lowerCase;
			}
			if(Character.isLowerCase(ch)) {
				char upperCase = Character.toUpperCase(ch);
				output = output + upperCase;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "A1ashVi6";
		ProgrammingTest2 programmingTest2 = new ProgrammingTest2();
		String finalString = programmingTest2.convertLowCaseToUppCaseAndUppCaseToLowCase(str);
		System.out.println(finalString);
		
	}

}
