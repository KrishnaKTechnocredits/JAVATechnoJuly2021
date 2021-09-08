package rasika_assignment_29;

public class Program2 {

	boolean isPallindrome(String input){
		int flag = 0;;
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) != input.charAt(input.length()-index -1)) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) {
			return false;
		}
		else
			return true;
	 }
	
	 void displayPallindromeResult(String input){
			if(isPallindrome(input))
					System.out.println(input + " is pallindrome");
				else
					System.out.println(input + " is not a pallindrome");
		 }

	public static void main(String[] args) {
		Program2 program2 = new Program2();		
		String input = "nitin";
		program2.displayPallindromeResult(input); 
	}
}
