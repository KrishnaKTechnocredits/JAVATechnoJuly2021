/*Program : 1
	WAP to print Reverse a given String.
	input : This is technocredits
	output : stiderconhcet si sihT  
	
	Program : 2
	reverse given string array.
	input : {"Credits", "Techno","From","Diwali","Happy"}
	output : {"Happy","Diwali","From","Techno","Credits"}

	Program : 3
	swap 2 numbers with using 3rd variable

	Program : 4
	swap 2 numbers without using 3rd variable*/

package shalaka.Assignment26;

public class ReverseString {
	String getRevString(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (int index = arr.length - 1; index >= 0; index--) {
			String revWord = getRevWord(arr[index]);
			output += " " + revWord;
		}
		// System.out.println(output.trim());
		return output.trim();
	}

	String getRevWord(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is technocredits";
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.getRevString(str));

	}
}
