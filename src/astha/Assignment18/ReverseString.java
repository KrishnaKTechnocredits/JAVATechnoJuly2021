/* Assignment - 18 : 19th Aug'21

Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Program 2 : Reverse all elements and place it in a reverse order
String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/

package astha.Assignment18;

import java.util.Arrays;

public class ReverseString {

		String getReverseString(String input) {
			String output = "";
			for(int index=input.length()-1;index>=0;index--) {
				output += input.charAt(index);
			}
			return output;
		}
		
		String[] getReverseStringArray(String[] inputArray) {
			String[] output = new String[inputArray.length];
			for(int index=0;index<inputArray.length;index++ ) {
				output[index] =getReverseString(inputArray[index]);
			}
			return output;
		}
		
		String[] getReverseElementsInReverseArray(String[] inputArray) {
			int n = inputArray.length-1;
			String[] output = new String[inputArray.length];
				for(int index=0;index<output.length;index++) {
					output[index] = inputArray[n];
					n--;
				}				
			return output;	
		}
		
		public static void main(String[] args) {
			ReverseString reverseString = new ReverseString();
			String[] inputArray = {"madhvi","surbhi","neha","sandesh","ankit","vaibhav"};
			String[] outputArray = reverseString.getReverseStringArray(inputArray);
			System.out.println(Arrays.toString(outputArray));
			String[] outputReverseArray = reverseString.getReverseElementsInReverseArray(outputArray);
			System.out.println(Arrays.toString(outputReverseArray));
		}
}
