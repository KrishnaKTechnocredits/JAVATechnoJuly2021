package ramkrishna;

import java.util.Arrays;
public class Assignment26b {

	String[] getreverseStringArray(String[] input) {
 		String[] output = new String[input.length];
 		for(int index=0;index<input.length;index++) {
 			output[index] = input[(input.length-1)-index];
 		}

 		return output;

 	}

 	public static void main(String[] args) {
 		Assignment26b assignment26b= new Assignment26b();
 		String[] input = {"Credits", "Techno","From","Diwali","Happy"};
 		String[] stringReverse=assignment26b.getreverseStringArray(input);
 		System.out.println("Given Array is :"+Arrays.toString(input));
 		System.out.println("Reverse Array is: "+Arrays.toString(stringReverse));
 	}
}
