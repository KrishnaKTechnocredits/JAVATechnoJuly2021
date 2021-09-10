package gauravk.Assignment_29;
/*
 * Assignment - 29 : 7th Sep'2021
 
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
 
 Hint : % and /
 */
public class CheckStringPallindomeUsingReverse {
	
	boolean checkPallindrome(String str) {
		String str1 = "";
		for(int i=str.length()-1; i>=0; i--) {
			str1 += str.charAt(i);
		}
		if(str1.equals(str))
			return true;
		else return false;
	}
	
	void displayOutcome(String s) {
		if(checkPallindrome(s))
			System.out.println("The word "+s+" is Pallindrome.");
		else System.out.println("The word "+s+" is NOT Pallindrome.");
	}
	
	public static void main(String[] args) {
		String input = "naman";
		new CheckStringPallindomeUsingReverse().displayOutcome(input);
	}
}
