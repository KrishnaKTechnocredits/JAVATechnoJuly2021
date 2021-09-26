package suchita;

//Assignment 38

// WAP to get a substring from given string

class Assignment38 {

	void getSubString(String input) {
		
		String output = "";
		
		System.out.println("\nGiven string :: " + input);
		output = input.substring((input.lastIndexOf("Hi")),(input.indexOf("Aashvi")));
		
		System.out.println("Required string :: " + output);
		
	}
	
	public static void main(String[] args) {
		
		Assignment38 assignment = new Assignment38();
		String input = "Hi Hello Techno Hi Credits Hello GM Neha Globant Aashvi Globant";
		assignment.getSubString(input);
	}
}