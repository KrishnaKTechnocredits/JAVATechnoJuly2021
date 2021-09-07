package chirag.assignment29;

public class StringPallindromeWithoutReverseMethod {
	
	boolean isPallindrome(String input) {
		
		int i =0;
		int j=input.length()-1;
		while(i<j) {
			if(input.charAt(i) != input.charAt(j))
				return false;
		i++;
		j--;
	}
	return true;
	}
	void displayResult(String input) {
		if(isPallindrome(input))
			System.out.println(input+" is pallindrome");
		else
			System.out.println(input+" is not pallindrome");
	}
	public static void main(String[] args) {
		StringPallindromeWithoutReverseMethod pallindromeWithoutReverseMethod = new StringPallindromeWithoutReverseMethod();
		
		String input = "pop";
		pallindromeWithoutReverseMethod.displayResult(input);
		input = "nayan";
		pallindromeWithoutReverseMethod.displayResult(input);
		input = "techno";
		pallindromeWithoutReverseMethod.displayResult(input);
	}
}
