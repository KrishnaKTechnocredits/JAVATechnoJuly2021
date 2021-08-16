package husain;

public class Assignment_15_Program2 {

	char[] findMiddleChar(String[] input) {
		int charIndex = 0;
		char[] output = new char[3];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() % 2 == 0) {
				charIndex = input[index].length() / 2 - 1;
				output[index] = input[index].charAt(charIndex);
			} else {
				charIndex = input[index].length() / 2;
				output[index] = input[index].charAt(charIndex);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_15_Program2 obj = new Assignment_15_Program2();
		String str[] = { "hello", "techno", "credits" };
		char[] charOutput = obj.findMiddleChar(str);
		System.out.println("The given array is: ");
		for(int index = 0; index<str.length; index++)
			System.out.print(str[index] + ", ");
		System.out.println("\n\nThe middle characters of the given array are: ");
		for (int index = 0; index < charOutput.length; index++)
			System.out.print(charOutput[index] + " ");

	}

}
