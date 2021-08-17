package deven_dc.assign;

public class Assignment15_p2 {
	char[] getMidCharOfStringArr(String[] input) {
		int midIndex = 0;
		char[] output = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				midIndex = input[index].length() / 2 - 1;
			} else {
				midIndex = input[index].length() / 2;
			}
			output[index] = input[index].charAt(midIndex);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Barney", "Ted", "Robin","Lily","Marshall" };
		char[] output = new char[input.length];
		Assignment15_p2 a15_p2 = new Assignment15_p2();
		output = a15_p2.getMidCharOfStringArr(input);
		for (int index = 0; index < output.length; index++) {
			System.out.println("Middle Character of '" + input[index] + "' is " + output[index]);
		}

	}
}
