/*Assignment - 18 : 19th Aug'21
Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.*/

package ritabrata;

import java.util.Arrays;

public class ReverseAllStringSameOrder {
	String getReverseStringSameOrder(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output=output + input.charAt(index);
		}
		return output;
	}
	
	String[] getReverseArraySameOrder(String[] arr) {
		String[] output= new String[arr.length];
		for(int index=0; index<arr.length;  index++) {
			String rev= getReverseStringSameOrder(arr[index]);
			output[index]= rev;
		}
		System.out.println("The reverse elements in the same order: "+Arrays.toString(output));
		return arr;
	}
	

	public static void main(String[] args) {
		ReverseAllStringSameOrder stringR= new ReverseAllStringSameOrder();
		String input= stringR.getReverseStringSameOrder("technocredits");
		System.out.println(input);
		System.out.println("------------------------------------------------------");
		String[] ip= {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		stringR.getReverseArraySameOrder(ip);

	}

}
