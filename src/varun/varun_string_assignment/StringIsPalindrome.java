/* Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";*/
package varun.varun_string_assignment;

public class StringIsPalindrome {
	boolean flag;
	boolean isStringPalindrome(String str) {
		String input = str;
		String output ="";
		for(int index=input.length()-1;index>=0;index--) {
			output += input.charAt(index);
		}
		if(input.equalsIgnoreCase(output)) {
			flag = true;
		}
		return flag;
	}
	
	void displayResult(String str) {
		if (isStringPalindrome(str) == true)
			System.out.println(str + " is a palendrome");
		else
			System.out.println(str + " is not a palendrome");
	}
	
	public static void main(String[] args) {
		String input = "naman";
		String input1 = "varun";
		StringIsPalindrome stringIsPalindrome = new StringIsPalindrome();
		stringIsPalindrome.displayResult(input1);
		stringIsPalindrome.displayResult(input);
	}
}
