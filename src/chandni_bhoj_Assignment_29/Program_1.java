/*Assignment - 29 : 7th Sep'2021
 
 Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 String input = "malayalam";
 boolean isPallindrome(String input){
 
 }
 
 void displayPallindromeResult(String input){
	if(isPallindrome(input))
			sop(input + " is pallindrome");
		else
			sop(input + " is not a pallindrome");
 }
 
 main(){
		String input = "madam";
		test.displayPallindromeResult(input);
 }
 
 (optional)program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 
 Hint : % and /*/


package chandni_bhoj_Assignment_29;

public class Program_1 {

	String getReverseString (String input) {
		String output = "";
		for (int index = input.length()-1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}
	
	boolean checkPalindromeStringWithReverseMenthod (String input1) {
		boolean flag = false;
		String output = getReverseString(input1);
		if (input1.equalsIgnoreCase(output))
			flag = true;
			else 
				flag = false;
		return flag;
		
		}
	
		void isPalindrome (boolean flag) {
			if (flag)
				System.out.println ("The given String is Palindrome");
			else 
				System.out.println ("The given String is not Palindrome");
		}
	
	
		
	public static void main(String[] args) {
		Program_1 program_1 = new Program_1();
		program_1.isPalindrome(program_1.checkPalindromeStringWithReverseMenthod("naman"));
		
	}
	
}
