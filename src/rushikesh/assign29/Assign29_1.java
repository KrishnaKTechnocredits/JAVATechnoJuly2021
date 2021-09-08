package rushikesh.assign29;
public class Assign29_1 {
	boolean isPallindrome(String  input) {
		String output = "";

	    for (int i = input.length() - 1; i >= 0; i--) {
	        output = output + input.charAt(i);
	    }
		if(input.equals(output)) 
			return true;
		
		return false;
	}
	
	void displayPallindromeResult(String input) {
		if(isPallindrome(input))
			System.out.println(input + " is Pallindrome");
		else
			System.out.println(input + " is not a Pallindrome");
	
	}
	public static void main(String[] args) {
		Assign29_1 assign29_1=new Assign29_1();
		String input="naman";
		assign29_1.displayPallindromeResult(input);
	}
}
