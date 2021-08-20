/*
 * Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.


 */
package harshada;
import java.util.Arrays;

public class ReverseArrayElementsInReversePosition {

		String reverseString (String input) {
			String output= " ";
			for(int index=input.length() - 1 ; index>=0; index--) {
				output = output + input.charAt(index);
			}
			return output;
		}
		
		String[] getReverseElementsOfArrayReversePosition(String input[]) {
			String output[]=new String[input.length];
			String tempOutput[]=new String[input.length];
			int temp=input.length-1;
			
			for(int index=0; index<input.length; index++) {
				
				output[index]=reverseString(input[index]);
				tempOutput[temp]=output[index];
				temp--;
					
			}
			return tempOutput;
		}
			
			public static void main(String a[] ) {
				ReverseArrayElementsInReversePosition reverseArrayElementsInReversePosition=new ReverseArrayElementsInReversePosition();
				String[] inputStr = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
				String outputStr[] = reverseArrayElementsInReversePosition.getReverseElementsOfArrayReversePosition(inputStr);
				System.out.println("Reverse String Array contents in reverse positions are :");
				System.out.println(Arrays.toString(outputStr));
				
			}
}
		

