/*
	Program : 2 
	Reverse given string array.
		input : {"Credits", "Techno","From","Diwali","Happy"}
		output : {"Happy","Diwali","From","Techno","Credits"}*/

package sayli_Vyavhare.Assignment_26;

public class ReverseStringArray {

	void getReverseStringArray(String[] input) {
		System.out.println("\n" + "After reverse string array is: ");
		for (int index = input.length - 1; index >= 0; index--) {
			System.out.print(input[index] + " ");
		}
	}

	public static void main(String[] args) {
		ReverseStringArray reverse = new ReverseStringArray();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("String array is :");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + " ");
		}
		reverse.getReverseStringArray(input);
	}
}
