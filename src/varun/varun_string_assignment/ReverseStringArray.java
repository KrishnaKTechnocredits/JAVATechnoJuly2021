package varun.varun_string_assignment;

import java.util.Arrays;

public class ReverseStringArray {
	void reverseIT(String[] str) {
		String output[] = new String[str.length];
		for(int index=0;index<str.length;index++) {
			output[index] = str[(str.length-1)-index];
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		reverseStringArray.reverseIT(input);
	}
}
