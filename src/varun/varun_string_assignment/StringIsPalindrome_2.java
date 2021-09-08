package varun.varun_string_assignment;

public class StringIsPalindrome_2 {
	
	void checkStringIsPalindrome(String str) {
		int count =0;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==str.charAt(str.length()-index-1))
				count++;
		}
		if(str.length()==count) 
			System.out.println("Given String " +str + " is a palindrome");
		else
			System.out.println("Given String " +str + " is not a palindrome");
	}
	
	public static void main(String[] args) {
		String input = "malayalam";
		StringIsPalindrome_2 stringIsPalindrome_2 = new StringIsPalindrome_2();
		stringIsPalindrome_2.checkStringIsPalindrome(input);
	}	
}
