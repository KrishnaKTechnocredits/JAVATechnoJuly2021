package husain.Assignment26;

import java.util.Arrays;

public class Program2 {

	void reverseArray(String arr[]) {
		String output[] = new String[arr.length];
		for (int index = 0; index < arr.length; index++)
			output[index] = arr[arr.length - index - 1];
		System.out.println("Output array is: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 obj = new Program2();
		String input[] = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.println("Input array is: " + Arrays.toString(input));
		obj.reverseArray(input);

	}

}
