package margi.Assignment_26;

import java.util.Arrays;

public class Assignment_26_2 {
	
	//reverse given string array
	void reverseArr(String[] input) {
		int temp=0;
		String[] output = new String[input.length];
		for(int index=input.length-1; index>=0; index--) {
			output[temp]=input[index];
			temp++;
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment_26_2 assignment_26_2 = new Assignment_26_2();
		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
		assignment_26_2.reverseArr(input);
	}
}
