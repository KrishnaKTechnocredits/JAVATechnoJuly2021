package prajwal;

public class Assignment_18 {

	static String[] reverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for (int index=0; index<input.length;index++) {
			String rev =  reverseString(input[index]);
			output[index] = rev;
		}
		return output;
	}

	static String reverseString(String input) {
		String  output = "";
		for (int index=input.length()-1; index>=0;index--) {
			output = output + input.charAt(index);
		}	
		return output;
	}

	static String[] reverseElementplace(String[] input) {
		String[] reverse_input = reverseArray(input);
		String[] reverse_word_array = new String[input.length];
		for (int index=0; index<input.length;index++) {
			reverse_word_array[index] = reverseString(reverse_input[index]);
		}
		return reverse_word_array;
	}

	static String[] reverseArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0; index<input.length; index++) {
			output[index] = input[input.length - index - 1];
		}
		return output;
	}

	public static void main(String args[]) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] reverse_input = reverseStringArray(input);
		for (int index=0; index<reverse_input.length;index++) {
			System.out.println(reverse_input[index]);
		}

		System.out.println();
		String[] input2 = {"techno", "credits", "neha", "sandesh"};
		String[] reverse_element_input = reverseElementplace(input2);
		for (int index=0; index<reverse_element_input.length;index++) {
			System.out.println(reverse_element_input[index]);
		}
	}
}