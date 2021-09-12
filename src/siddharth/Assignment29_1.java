/*Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";*/

package siddharth;

public class Assignment29_1 {
	int count = 0;
	boolean flag;

	boolean isPalindrome(String str) {
		String input = str;
		String output = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
			
		}
		if (input.equals(output)) {
			flag = true;
		} else
			flag = false;

		return flag;
	}

	void displayResult(String str) {
		if (isPalindrome(str) == false)
			System.out.println(str + " is not Palindrome");
		else if (flag = true) {
			System.out.println(str + " is palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment29_1 assignment29_1 = new Assignment29_1();
		assignment29_1.displayResult("naman");
		assignment29_1.displayResult("siddharth");
		assignment29_1.displayResult("madam");
		assignment29_1.displayResult("civic");

	}
}

