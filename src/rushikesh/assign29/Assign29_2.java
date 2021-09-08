package rushikesh.assign29;

public class Assign29_2 {
	boolean isPallindrome(String  input) {		
		int i = 0, j = input.length() - 1;
		 
        while (i < j) {
        	if (input.charAt(i) != input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
	}
	
	void displayStringPallindromeResult(String input) {
	
		if(isPallindrome(input))
			System.out.println(input + " is Pallindrome");
		else
			System.out.println(input + " is not a Pallindrome");
	
	}
	public static void main(String[] args) {
		Assign29_2 assign29_2=new Assign29_2();
		String input="naman";
		assign29_2.displayStringPallindromeResult(input);
	}
}



