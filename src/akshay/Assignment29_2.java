package akshay;

public class Assignment29_2 {
	
	boolean getPallindrome(String input){
		 boolean isPallindrome = true;
		 int length = input.length()-1;
		 int mid = input.length()/2;
		 for(int index = 0; index < mid; index++) {
			if(input.charAt(index) != input.charAt(length)) {
				isPallindrome = false;
			}
			else
				length--;
		 }
		 
		 return isPallindrome;
	}
	
	void displayPallindromeResult(String input){
		if(getPallindrome(input))
				System.out.println(input + " is pallindrome");
			else
				System.out.println(input + " is not a pallindrome");
	 }
	
	public static void main(String[] args) {
		Assignment29_2 assignment29_2 = new Assignment29_2();
		String input = "naman";
		assignment29_2.displayPallindromeResult(input);
		String input1 = "aabbaa";
		assignment29_2.displayPallindromeResult(input1);
		String input2 = "Akshay";
		assignment29_2.displayPallindromeResult(input2);
	}
}