package suchita;

// Assignment 30

class Assignment30 {

	// Reverse given number
	int getReverseNumber(int input) {
		
		int rem = 0;
		int reverse = 0; 
		
		while (input > 0) {
			
			rem = input % 10;
			reverse = (reverse * 10) + rem;
			input = input / 10;
		}
		return reverse;
	}
	
	// Check given number is Armstrong number or not
	void checkArmstrongNumber(int input) {
		
		int output = input;
		int sum = 0;
		int rem = 0; 
		
		while (input != 0) {
			
			rem = input % 10;
			sum = sum + (rem * rem * rem);
			input = input / 10;
		}
		
		if (output == sum) {
			System.out.println(output + " is a Armstrong number");
		} else {
			System.out.println(output + " is not a Armstrong number");
		}
	}

	// Check given number is palindrome or not
	void checkPalindromeNumber(int input) {
		
		if (input == getReverseNumber(input))
			System.out.println(input + " is palindrome number");
		else
			System.out.println(input + " is not palindrome number\n");

	}

	
	// Check given number is perfect number or not
	void checkPerfectNumber(int input) {
		
		int output = 0;
		
		for (int index = 1; index < input; index++) {
			if (input % index == 0) {
				output += index;
			}
		}
		
		if (output == input)
			System.out.println(input + " is perfect Number");
		else
			System.out.println(input + " is not perfect Number");
	}

	// Check given number is perfect square or not
	void checkPerfectSquare(int input) {
		
		int sq =(int) Math.sqrt(input);
		int output = sq * sq;
		
		
		if (output == input)
			System.out.println(input + " is perfect Sqaure");
		else
			System.out.println(input + " is not perfect square");

	}
	
	public static void main(String[] args) {
		
		Assignment30 assignment = new Assignment30();
		int input = 12345;
		int output = assignment.getReverseNumber(input);
		System.out.println("The reverse string :: " +output);
		assignment.checkArmstrongNumber(153);
		assignment.checkArmstrongNumber(372);
		assignment.checkPalindromeNumber(123);
		assignment.checkPalindromeNumber(121);
		assignment.checkPerfectNumber(6);
		assignment.checkPerfectNumber(56);
		assignment.checkPerfectSquare(144);
		assignment.checkPerfectSquare(122);
	}
}