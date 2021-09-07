package chirag.assignment29;

public class StringPallindromeByReverseMethod {
	
	boolean isPallindrome(String input) {
		String revString = "";
		for(int index=input.length()-1;index >=0;index--) {
		revString=revString + input.charAt(index);
		}
			if(input.equals(revString)) 
				return true;
		else
			return false;
	}
	void displayResult(String input) {
		
		if(isPallindrome(input))
			System.out.println(input+" is pallindrome");
		else
			System.out.println(input+" is not pallindrome");
	}
	public static void main(String[] args) {
		StringPallindromeByReverseMethod byReverseMethod=new StringPallindromeByReverseMethod();
		String input = "naman";
		byReverseMethod.displayResult(input);
		
		input = "malayalam";
		byReverseMethod.displayResult(input);
		
		input = "chirag";
		byReverseMethod.displayResult(input);
	
	
	}

}
