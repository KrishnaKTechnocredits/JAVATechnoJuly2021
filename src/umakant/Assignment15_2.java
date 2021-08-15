package umakant;

public class Assignment15_2 {

	char[] getMiddleCharacters(String[] input) {
		int length = input.length;
		char[] output = new char[length];
		for (int index = 0; index < length; index++) {
			int elementLength = input[index].length();
			if (elementLength % 2 == 0)
				output[index] = input[index].charAt((elementLength / 2) - 1);
			else
				output[index] = input[index].charAt(elementLength / 2);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment15_2 assignment15_2 = new Assignment15_2();
		String[] input = { "Hello", "Techno", "Credit" };
		char[] output = assignment15_2.getMiddleCharacters(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}
}
