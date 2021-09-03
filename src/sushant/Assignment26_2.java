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


package sushant;

public class Assignment26_2 {
	public static void main(String[] args) {
		Assignment26_2 assignment26_2 = new Assignment26_2();
		System.out.println("Reverse String will be :- "
				+ assignment26_2.getReverseString("This is Technocredits Training and This is our Assignment"));
	}

	// method to get reverse String from a given input string
	String getReverseString(String inputString) {
		System.out.println("Given Input String is :- " + inputString);
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString += inputString.charAt(index);
		}
		return reverseString;

	}
}