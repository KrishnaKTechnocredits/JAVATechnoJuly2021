package bhagyashree;

public class Assignment26 {

	/*
	 * WAP to print Reverse a given String. input : This is technocredits output :
	 * stiderconhcet si sihT
	 * 
	 */
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	/*
	 * reverse given string array. input : {"Credits",
	 * "Techno","From","Diwali","Happy"} output :
	 * {"Happy","Diwali","From","Techno","Credits"}
	 * 
	 */

	String[] getReverseStringArray(String[] array) {
		String[] outputarray = new String[array.length];
		for (int index = 0; index < array.length; index++) {
			outputarray[index] = array[(array.length - 1) - index];
		}
		return outputarray;
	}

	/*
	 * swap 2 numbers with using 3rd variable
	 */
	void swapWithVariable(int a, int b) {
		System.out.println("Values before swap: " + a + " " + b);
		int c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println("Values after swap: " + a + " " + b);
	}

	/*
	 * swap 2 numbers without using 3rd variable
	 */
	void swapWithoutVariable(int a, int b) {
		System.out.println("Values before swap: " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Values after swap: " + a + " " + b);
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		System.out.println("Reverse String: " + assignment26.getReverseString("This is technocredits"));

		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Reverse string array: " + assignment26.getReverseStringArray(input));

		System.out.println("----------------Swap using variable--------------------");
		assignment26.swapWithVariable(20, 30);

		System.out.println("----------------Swap using without variable--------------------");
		assignment26.swapWithoutVariable(60, 30);
	}

}
