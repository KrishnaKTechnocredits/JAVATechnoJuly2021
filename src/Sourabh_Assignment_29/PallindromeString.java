package Sourabh_Assignment_29;

public class PallindromeString {

	String revString(String str){
		String input = "";

		for(int index = str.length()-1; index >= 0; index--){
			input = input + str.charAt(index);
		}

		return input;
	}

	static boolean isPallindrome(String str) {

		String input = "";
		int count = 1;
		for(int index = 0; index < str.length(); index++){

			if(str.charAt(index) == str.charAt(str.length()-count)) {
				count++;
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args){

		String str = "naman";
		String str1 = "aabbaa";

		PallindromeString pallindrome  = new PallindromeString();
		String output = pallindrome.revString(str);

		if(str.equals(output))
			System.out.println(output+" is palindrome string.");
		else 
			System.out.println(output+" is not palindrome string.");


		if(PallindromeString.isPallindrome(str1))
			System.out.println(str1+" is palindrome string.");
		else 
			System.out.println(str1+" is not palindrome string.");
	}
}
