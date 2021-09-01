package suchita;

class Assignment25 {

	
	// sum og the numbers in given string
	
	int getSumOfnumbersInString(String input) {
		
	int sum = 0;
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				str += input.charAt(index);
			} else {
				if (!str.equals("")) {
					sum += Integer.parseInt(str);
					str = "";
				}
			}
		}
		return sum;
	}
	
	// convert into string in the reverse of the given cases.
	
	String getUppercase(String input) {
		
		String upper = ""; String lower = "";
		String digit = "";
		
		for (int index = 0; index < input.length(); index++) {
			
			if (Character.isUpperCase(input.charAt(index))) {
				upper += input.charAt(index);
				
			} else if (Character.isLowerCase(input.charAt(index))) {
				lower += input.charAt(index);
				
			} else if (Character.isDigit(input.charAt(index))) {
				digit += input.charAt(index);
			}
		}
		return upper + digit + lower;
	}

	
	
	public static void main(String[] args) {
		
		Assignment25 assignment = new Assignment25();
		String input = "te12ch33no3credit4s";
		String input1 = "Ma1U2liK";
		
		System.out.println("\n Sum of Numbers in string is :: " + assignment.getSumOfnumbersInString(input));
		System.out.println("\n String in the reverse case :: " + assignment.getUppercase(input1));
				
	}
}