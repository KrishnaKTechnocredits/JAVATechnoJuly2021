package suchita;

// Assignment 43

class Assignment43 {

	void getLength(String input) {
	
		int count = 0;
		
		System.out.println("Given string :: "+input);
		while(true) {
		
			try {
				input.charAt(count);
				count++;
			} catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println(" Length of the string :: " + count);
	}

	public static void main(String[] args) {
		
		Assignment43 assignment = new Assignment43();
		String input="technocredits";
		 assignment.getLength(input);
	}
}