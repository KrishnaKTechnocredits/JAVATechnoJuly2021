package monali.Assignment_26;

/*Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  */

public class StringReverse {

	void reverseString(String str) {
		for (int index = str.length() - 1; index >= 0; index--) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		new StringReverse().reverseString("This is technocredits");
	}
}
