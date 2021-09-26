package technocredits1.arrayDemo;

import java.util.Arrays;

import javax.naming.spi.ResolveResult;

// char charAt(int index)
public class StringReverseArray {

	String reverseString(String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	String[] reverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0;index<input.length;index++) {
			output[index] = reverseString(input[index]);
		}
		System.out.println(output);
		return output;
	}
	
	public static void main(String[] args) {
		StringReverseArray stringR = new StringReverseArray();
		//String reverseString = stringR.reverseString("technocredits");
		//System.out.println(reverseString);
		//String[] input =  {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		String[] input = {"techno", "credits", "krishna","harsh"};
		String[] temp = stringR.reverseStringArray(input);
		
		System.out.println(Arrays.toString(temp));
		for(int index=0;index<input.length;index++) {
			System.out.println(input[index]);
		}
		/*int index=0;
		while(index<output.length) {
			System.out.println(output[index]);
			index++;
		}*/
	}
}
