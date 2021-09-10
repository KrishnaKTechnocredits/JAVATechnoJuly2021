package nidhi;

//Check given string is pallindrome

class Assignment_29_Program2{
 
	 void displayPallindromeResult(String input){
		if(findPallindrome(input))
				System.out.println(input + " is pallindrome");
			else
				System.out.println(input + " is not a pallindrome");
	 }
	 
	 boolean findPallindrome(String input){
		 for (int i=0;i<input.length()/2;i++){
			if (input.charAt(i) == input.charAt((input.length()-1) - i)){
			}else
				return false;
		}
		 return true;
	 }
	 
	 public static void main(String[] arg){
			Assignment_29_Program2 assignment29 = new Assignment_29_Program2();
			String input = "malayalam";
			assignment29.displayPallindromeResult(input);
			
	 }
}