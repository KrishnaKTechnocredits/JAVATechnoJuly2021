package genius;

import java.util.Arrays;

public class Assignment_26_Program2 {
	
	//reverse given string array
	void reverseArray(String[] input) {
		int temp=0;
		String[] output = new String[input.length];
		for(int index=input.length-1; index>=0; index--) {
			output[temp]=input[index];
			temp++;
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] str = {"Credits", "Techno","From","Diwali","Happy"};
		Assignment_26_Program2 assignment_26_Program2 = new Assignment_26_Program2();
		assignment_26_Program2.reverseArray(str);
	}

}
