package chandani.Assignment_29;

public class Assignment29b {

boolean isPalindrome(String input){
		
		boolean flag=true;
		for(int index=0;index<input.length();index++) {
			if(input.toLowerCase().charAt(index)!=input.toLowerCase().charAt(input.length()-index-1)) {
				flag=false;
			}
		}
		return flag;
	}
	
	void displayPallindromeResult(String input){
		if(isPalindrome(input))
				System.out.println(input + " is palindrome");
			else
				System.out.println(input + " is not a palindrome");
	 }

	
	public static void main (String[] args){
		Assignment29b assignment29b = new Assignment29b();
		assignment29b.displayPallindromeResult("Madam");
		assignment29b.displayPallindromeResult("Malayalam");
		assignment29b.displayPallindromeResult("Naman");
		assignment29b.displayPallindromeResult("aabbaa");
		assignment29b.displayPallindromeResult("Technocredits");
     }
}
