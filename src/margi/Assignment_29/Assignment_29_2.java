package margi.Assignment_29;

public class Assignment_29_2 {
	
	//string is palindrome or not without reverse logic
	boolean isPalindrome(String input) {
		//for even length string
		if(input.length()%2==0) {
			int index=0;
			int count=0;
			while(index<input.length()/2-1) {
				for(int innerIndex=input.length()-1;innerIndex>=0;innerIndex--) {
					if(input.charAt(index)==input.charAt(innerIndex))
						count++;
					else
						count=0;
					index++;
				}
			}
			if(count>0)
				return true;
			else
				return false;
		}
		//for odd length string
		else {
			int index=0;
			int count=0;
			while(index<input.length()/2) {
				for(int innerIndex=input.length()-1;innerIndex>=0;innerIndex--) {
					if(input.charAt(index)==input.charAt(innerIndex))
						count++;
					else
						count=0;
					index++;
				}
			}
			if(count>0)
				return true;
			else
				return false;
		}
	}
	void displayResult(String input) {
		if(isPalindrome(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not palindrome");
	}
	public static void main(String[] args) {
		Assignment_29_2 assignment_29_1 = new Assignment_29_2();
		String input = "malayalam";
		assignment_29_1.displayResult(input);
		Assignment_29_2 assignment_29_2 = new Assignment_29_2();
		input = "computer";
		assignment_29_2.displayResult(input);
	}
}
