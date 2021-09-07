/* Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";
 
 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 
 program 3 : given number is pallindrome or not, without converting it input into String?
 int num = 12321;
 ans : true
 */
package monika;

public class PalindromeString {

	void reverseString(String input) {
		String output="";
		for(int index=input.length()-1;index>=0;index--) {
			output+=input.charAt(index);
		}
		if(input.equals(output))  
			System.out.println("'"+input+ "' is Palindrome Srting");
		else 
			System.out.println("'"+input+ "' is Not Palindrome String");
		
	}
	
	boolean isPalindrome(String input) {
		boolean flag=true;
		String str=input.toLowerCase();
		int length=str.length();
		for(int index=0;index<length/2;index++) {
			if(str.charAt(index)!=str.charAt(length-index-1)) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	void displayPalindromeResult(String input) {
		
		if(isPalindrome(input))
			System.out.println("'"+input + "' is Palindrome String");
		else
			System.out.println("'"+input + "' is not a Palindrome String");
 
	}
	
	boolean isPalindromeNumber(int number) {
		int remainder=0, sum=0, temp=number;
		boolean flag=false;
		while(number!=0){
		      remainder= number % 10;
		      sum = (sum * 10) + remainder;
		      number = number / 10;
		    }
		if(sum==temp)
			flag=true;
		else
			flag=false;
		return flag;
	}
	public static void main(String[] args) {
		PalindromeString palindromestring=new PalindromeString();
		palindromestring.reverseString("malayalam");
		palindromestring.reverseString("madan");
		System.out.println("----------------------------------------");
		palindromestring.displayPalindromeResult("radar");
		palindromestring.displayPalindromeResult("monika");
		System.out.println("----------------------------------------");
		System.out.println(palindromestring.isPalindromeNumber(12321));
		System.out.println(palindromestring.isPalindromeNumber(123211));
		
	}
	
}

