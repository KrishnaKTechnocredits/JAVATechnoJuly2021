package margi.Assignment_18;

import java.util.Arrays;

public class Assignment_18_2 {
	
	//Reverse all elements and place it in a reverse order
	String[] processData(String[] input) {
		String[] output = new String[input.length];
		int temp=0;
		for(int index=input.length-1; index >= 0; index--) {
			output[temp] = reverseStr(input[index]);
			temp++;
		}
		return output;
	}
	
	String reverseStr(String name) {
		String str = "";
		for(int index=name.length()-1; index >= 0 ; index--) {
			str = str + name.charAt(index);
		}
		return str;
	}
	
	void setData() {
		String[] input = {"techno", "credits", "krishna","harsh"};
		System.out.println(Arrays.toString(processData(input)));
	}
	
	public static void main(String[] args) {
		Assignment_18_2 name = new Assignment_18_2();
		name.setData();
	}
}
