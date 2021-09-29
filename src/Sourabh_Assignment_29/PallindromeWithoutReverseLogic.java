package Sourabh_Assignment_29;

public class PallindromeWithoutReverseLogic {

	boolean isPallindrome(String input) {

		int firstindex = 0;
		int lastindex = input.length()-1;

			while(firstindex < lastindex) {
				if(input.charAt(firstindex) == input.charAt(lastindex))
					return true;
				firstindex++;
				lastindex--;
			}
		return false;
		}

	void isPallindrome1(String input) {

		boolean status = false;
		int lastindex = input.length()-1;

			for(int firstindex = 0; firstindex < lastindex; firstindex++) {

				if(input.charAt(firstindex) == input.charAt(lastindex))
					lastindex--;
					status = true;
			}
			if(status)
				System.out.println(input+" is palindrome string.");
			else 
				System.out.println(input+" is not palindrome string.");
	}

	public static void main(String[] args){

		String str1 = "aabbaa";
		String str = "madam";

		PallindromeWithoutReverseLogic pallindrome  = new PallindromeWithoutReverseLogic();

		if(pallindrome.isPallindrome(str1))
			System.out.println(str1+" is palindrome string.");
		else 
			System.out.println(str1+" is not palindrome string.");

		pallindrome.isPallindrome1(str);
	}

}