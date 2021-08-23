package atul_K.Assignments.Ass18;

public class Program1 {
	String revString (String str) {
		String out = "";
		for (int index=str.length()-1; index >=0 ; index--) {
			out = out + str.charAt(index);
		}
		return out;
	}
	
	void revArrStr(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arr[index] = revString(arr[index]);
		}
	}
	
	String[] revStrAndStrofArr(String[] arr) {
		String[] out = new String[arr.length];
		for (int index =0;index<arr.length;index++) {
			out[arr.length-1-index] = revString(arr[index]);
		}
		return out;
	}
	
	void display(String[] arr) {
		for(int index =0; index < arr.length;index++) {
			System.out.println(arr[index]);
		}
	}
	
	public static void main (String[] args) {
		String[] arr = {"Maulik","Krishna","Shital","Ashvi"};
		Program1 program1 = new Program1();
		program1.revArrStr(arr);
		System.out.println("pragram 1 output of Assignment18 as following");
		program1.display(arr);
		String[] temp = program1.revStrAndStrofArr(arr);
		System.out.println("pragram2 output of Assignment18 as following");
		System.out.println("By considering pragram1 output as input for program 2");
		program1.display(temp);
	}
}
/* not be able to understand the Note provided in Assignment18 that we can print array content directly 
using SOP(arrays.toString(output)); tried in display method with System.out.println(arr.toString());
but it prints the address instead of content or value.
*/