package shreya_assignment_29_pallindrome;

public class PallindromeByReverseLogic {
	boolean isPallindrome(String str) {
		String reverseString="";
		for(int index=str.length()-1;index>=0;index--) {
			reverseString+=str.charAt(index);
		}
		if(str.equals(reverseString)) {
			return true;
		}
		else {
			return false;
		}
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
		PallindromeByReverseLogic pallindromeByReverseLogic=new PallindromeByReverseLogic();
		pallindromeByReverseLogic.displayResult("naman");

	}

}
