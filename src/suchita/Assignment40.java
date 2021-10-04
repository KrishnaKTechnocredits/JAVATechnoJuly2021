package suchita;

// Assignment 40

//Programme that requires exception handling

class Assignment40 {

	void getDigits(String input) {
		
		int num = 0;
		String[] output = input.split(" ");
		
		System.out.println("\nGiven string ::"+input);
		System.out.println("Digits ::" );
		for (int index = 0; index < output.length; index++) {
			try {
				num = Integer.parseInt(output[index]);
				System.out.println(num);
			} catch (NumberFormatException ex) {

			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Assignment40 assignment = new Assignment40();
		String input1 = "I have 5 years and 3 months of experience";
		String input2 = "I have 15 years and 3 months of experience";
		assignment.getDigits(input1);
		assignment.getDigits(input2);
	}
}