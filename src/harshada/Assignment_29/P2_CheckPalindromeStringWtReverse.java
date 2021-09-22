package harshada.Assignment_29;

public class P2_CheckPalindromeStringWtReverse {

	
	void getPalindromeStrWTReverseLogic(String input) {
		int counter=0;
		System.out.println("Input String is: " + input);
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==input.charAt(input.length()-index-1)) {
				counter++;
			}
		}
			if(counter==input.length()) {
				System.out.println("Given String is Palindrome\n");
			}
			else
				System.out.println("Given String is not a Palindrome\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2_CheckPalindromeStringWtReverse p2=new P2_CheckPalindromeStringWtReverse();
		p2.getPalindromeStrWTReverseLogic("naman");
		p2.getPalindromeStrWTReverseLogic("malayalam");
		p2.getPalindromeStrWTReverseLogic("harshada");
	}

}
