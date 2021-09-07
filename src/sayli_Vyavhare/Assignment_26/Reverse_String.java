/* Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  
 */

package sayli_Vyavhare.Assignment_26;

public class Reverse_String {

	String temp = " ";

	void getReverseString(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {

			temp = temp + input.charAt(index);

		}
		System.out.println("Reverse String is:" + temp);
	}

	public static void main(String[] args) {
		Reverse_String reverse = new Reverse_String();
		reverse.getReverseString("This is technocredits");
	}

}
