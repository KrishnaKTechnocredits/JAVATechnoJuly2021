package suchita;

//Assignment 35

class Assignment35 {

	boolean isDigits(String input) {
		
		boolean digit = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)) && input.length() == 6) {
				digit = true;
			} else {
				digit = false;
				break;
			}
		}
		return digit;
	}
	
	 boolean isLetters(String input) {
		 
		boolean letter = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index)) && input.length() == 4) {
				letter = true;
			} else {
				letter = false;
				break;
			}
		}
		return letter;
	}
	
	 void isValidNumber(String input) {
		 
		boolean valid = false;
		String[] output = input.split(" ");
		if (output.length == 3 || output.length == 4) {
			if (output.length == 3) {
				if (input.charAt(2) == '-') {
					String str = input.substring(0, 2) + input.substring(6, 8);
					
					if (isLetters(str)) {
					
						String num = input.substring(3, 5) + input.substring(9);
						if (isDigits(num)) {
							valid = true;
						} else {
							valid = false;
						}
					} else {
						valid = false;
					}
				} else
					valid = false;
			} else if (output.length == 4) {
				String str = input.substring(0, 2) + input.substring(6, 8);
				
				if (isLetters(str)) {
					String num = input.substring(3, 5) + input.substring(9);
					if (isDigits(num)) {
						valid = true;
					} else
						valid = false;
				} else
					valid = false;
			} else
				valid = false;
		}
		if(valid)
			System.out.println(input + " is a valid number");
		else
			System.out.println(input + " is a in-valid number");
	}

	
	public static void main(String[] args) {
		
		Assignment35 assignment = new Assignment35();
		String input1 = "MH 12 BK 4432";
		String input2 = "MH-12 BK 1432";
		String input3 = "GJ 05 MK 1123";
		String input4 = "MH 12-BK 4432";
		assignment.isValidNumber(input1);
		assignment.isValidNumber(input2);
		assignment.isValidNumber(input3);
		assignment.isValidNumber(input4);
	}
	
}