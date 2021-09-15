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

public class CheckStringPallindromeWithoutReverseLogic {

	boolean checkPallindrome(String str) {
		int counter=0;
		if(str.length()%2==0) {
			for(int i=0, j=str.length()-1; i<str.length()/2; i++,j--) {
				if(str.charAt(i)==str.charAt(j))
					counter++;
			}
		} else {
			for(int i=0, j=str.length()-1; i<(str.length())/2; i++,j--) {
				if(str.charAt(i)==str.charAt(j))
					counter++;
			}
		}
		
		if(counter==str.length()/2)
			return true;
		else return false;
	}
	
	void displayOutcome(String s) {
		if(checkPallindrome(s))
			System.out.println("The word "+s+" is Pallindrome.");
		else System.out.println("The word "+s+" is NOT Pallindrome.");
	}
	
	public static void main(String[] args) {
		String input1 = "naman";
		String input2 = "namman";
		String input3 = "namjman";
		String input4 = "namjnan";
		String input5 = "aabbaa";
		String input6 = "malayalam";
		String input7 = "Naman";
		CheckStringPallindromeWithoutReverseLogic abc = new CheckStringPallindromeWithoutReverseLogic();
		abc.displayOutcome(input1);
		abc.displayOutcome(input2);
		abc.displayOutcome(input3);
		abc.displayOutcome(input4);
		abc.displayOutcome(input5);
		abc.displayOutcome(input6);
		abc.displayOutcome(input7);
	}
}