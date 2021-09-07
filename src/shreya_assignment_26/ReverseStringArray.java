package shreya_assignment_26;

import java.util.Arrays;
public class ReverseStringArray {
	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = input[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		ReverseStringArray reverse = new ReverseStringArray();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		System.out.println(Arrays.toString(reverse.getReverseElementAtReverseOrder(input)));
		
	}
}
	

		

