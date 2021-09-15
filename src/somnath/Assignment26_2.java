package somnath;

import java.util.Arrays;
public class Assignment26_2 {
	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment26_2 reverse = new Assignment26_2();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println(Arrays.toString(reverse.getReverseElementAtReverseOrder(input)));

	}
}