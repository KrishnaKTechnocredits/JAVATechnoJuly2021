package akanksha_K_new;  

public class Assignment29 {
	
	void getPalindrome(String input) {
		String reverse = ""; 
		int length = input.length(); 
		for (int index = length - 1; index >= 0; index--) {
			 reverse = reverse + input.charAt(index);  
		}
		if (input.equals(reverse)) { 
	         System.out.println(input + " string is a palindrome.");  
	      }  
	      else {
	         System.out.println(input + " string is not a palindrome."); 
	      }  
	}
	
	boolean isPallindrome(String input1){
		for (int index = 0; index < input1.length(); index++) {
			if(input1.charAt(index) == input1.charAt(input1.length()-1)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false; 
	 }
	
	public static void main(String args[]) {
		String input = "naman";
		String input1 = "aabbccddd";
		
		Assignment29 assi = new Assignment29();
		assi.getPalindrome(input);
		boolean flag = assi.isPallindrome(input1);
		if(flag) {
			System.out.println(input1 + " string is palindrome."); 
		}
		else {
		System.out.println(input1 + " string is not palindrome."); 
		}
	}
}
