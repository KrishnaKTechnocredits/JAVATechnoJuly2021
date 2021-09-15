package shreya_assignment_29_pallindrome;

public class PallindromeWithoutReverse {
	boolean isPallindrome(String str) {
		int reverseIndex=str.length()-1;
		boolean flag =false;
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==str.charAt(reverseIndex)) {
				flag=true;
				return true;
			}
			reverseIndex--;
		}
		return flag;
	}
	
	void displayResult(String str) {
		if(isPallindrome(str)) {
			System.out.println(str+" is pallindrome");
		}
		else {
			System.out.println(str+" is not a pallindrome");
		}
	}

	public static void main(String[] args) {
		PallindromeWithoutReverse pallindromeWithoutReverse=new PallindromeWithoutReverse();
		pallindromeWithoutReverse.displayResult("naman");
		pallindromeWithoutReverse.displayResult("aabbaa");
		pallindromeWithoutReverse.displayResult("malayalam");
	}

}
