package chirag.assignment26;

import java.util.Arrays;

public class ReverseStringArray {
	
	void getReverseStringArray(String [] input) {
		String [] output = new String[input.length];
		for (int index=input.length -1 ; index >= 0; index--) {
			output[index]=input[(input.length -1) - index];
			
		}
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		
		ReverseStringArray reverseStringArray = new ReverseStringArray();
		String [] str = {"Credits","Techno","From","Diwali","Happy"}; 
		reverseStringArray.getReverseStringArray(str);
		}
	}

