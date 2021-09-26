package nidhi;

//Check given string is pallindrome

class Assignment_29_Program1{

	boolean isPallindrome(String input){
		String reverseInput="";
		for (int i=input.length()-1;i>=0;i--){
			reverseInput += input.charAt(i);
		}
		if (input.equals(reverseInput))
			return true;
		else
			return false;
	}
 
	 void displayPallindromeResult(String input){
		if(isPallindrome(input))
				System.out.println(input + " is pallindrome");
			else
				System.out.println(input + " is not a pallindrome");
	 }
	 
	
	 
	 public static void main(String[] arg){
			Assignment_29_Program1 assignment29 = new Assignment_29_Program1();
			String input = "malayalam";
			assignment29.displayPallindromeResult(input);
			
	 }
}