/*  Program 1 : String Pallindrome by writing reverse method logic.
 String input = "naman";

 program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";
 String input = "malayalam";

*/

package harshada.Assignment_29;

public class P1_FindPalindromeUsingReverseMethod {

	void getPalindromStringUsingReverseLogic(String str) {
		System.out.println("Input String is = "+ str);
		String tempReverseStr=" ";
		for(int index=str.length()-1; index>=0; index--) {
			tempReverseStr=tempReverseStr+str.charAt(index);
		}
		if(tempReverseStr.equals(str)) {
			System.out.println("Given String is a Palindrome String");
		}
		else
			System.out.println("Given String is not a Palindrome String\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1_FindPalindromeUsingReverseMethod p1=new P1_FindPalindromeUsingReverseMethod();
		p1.getPalindromStringUsingReverseLogic("Harshada");
		p1.getPalindromStringUsingReverseLogic("naman");
	}

}
