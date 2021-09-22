package akanksha_K_new;

import java.util.Arrays;

public class Assigment26 {
	
	String getReverseString(String str1) {
		String reverse = "";
		for(int index=str1.length()-1; index>=0;index--) {
			reverse = reverse +str1.charAt(index);
		}
		return  reverse;
	}
	
	String[] getReverseStringArray(String[] str2) {
		String[]  output = new String[str2.length];
		int i=0;
		for(int index=str2.length-1; index>=0;index--) {
			output[i]= str2[index];
			i++;	
		}
		return output;
	}
	
	void swapNumber(int x, int y) {
		int a;
		a = x;
		x = y;
		y = a;
		System.out.println("Value of X: " + x + " Value of Y: " + y);
	}
	
	void swapNumberWithoutUsingThirdNumber(int x, int y) {
		x = x+y;
		y =x-y;
		x = x-y;
		System.out.println("Value of X: " + x + " Value of Y: " + y);
	}
	
	public static void main(String args[]) {
		String str1 = "This is technocredits";
		String[] str2  = {"Credits", "Techno","From","Diwali","Happy"};
		Assigment26 assi  = new Assigment26();
		System.out.println("Reverse of given string is: " + assi.getReverseString(str1));
		
		String[] output  = assi.getReverseStringArray(str2);
		System.out.println("Reverse of given string Array is: " + Arrays.toString(output));
		
		assi.swapNumber(50,100);
		assi.swapNumberWithoutUsingThirdNumber(10,5);
	}
}
