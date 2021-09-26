package monali.Assignment_26;
/*Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/

public class ReverseStringArray {

	void stringArrayReverse(String[] input) {

		for (int index = input.length - 1; index >= 0; index--) {
			System.out.print(input[index] + " ");
		}

	}

	public static void main(String[] args) {
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		new ReverseStringArray().stringArrayReverse(input);
	}
}
