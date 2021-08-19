package husain;

public class Assignment_17 {

	String printReverseString(String arr) {
		char ch[] = arr.toCharArray();
		char test[] = new char[ch.length];

		for (int index = 0; index < ch.length; index++)
			test[index] = ch[(ch.length - 1) - index];

		String output = new String(test);

		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_17 obj = new Assignment_17();
		String input = "technocredits";
		String str = obj.printReverseString(input);
		System.out.println("The string to be reversed is: " + input);
		System.out.println("The reversed string is: " + str);

	}

}
