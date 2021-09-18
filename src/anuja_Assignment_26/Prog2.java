//WAP to reverse String array
package anuja_Assignment_26;

import java.util.Arrays;

public class Prog2 {

	String[] reverseArray(String[] input) {
		String[] output=new String[input.length];
		for(int i=input.length-1;i>=0;i--) {
			output[input.length-1-i]=input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Prog2 prog2=new Prog2();
		String[] input= {"Credits","Techno","From","Diwali","Happy"};
		System.out.println("Reversed String is "+ Arrays.toString(prog2.reverseArray(input)));
	}
}
