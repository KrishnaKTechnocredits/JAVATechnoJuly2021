/*Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/

package monika;
import java.util.Arrays;

public class Assignment18_Program_2 {

	String getReverseString(String input){
		String output="";
		for(int index=input.length()-1;index>=0;index--){
			output+=input.charAt(index);
		}
		return output;
	}
	String[] getReverseStringReverseArray(String[] input){
		String[] output= new String[input.length];
		int count=0;
		for(int index=input.length-1;index>=0;index--){
			output[count]=getReverseString(input[index]);
			count++;
		}
		return output;
	}
	public static void main(String[] args)	{
		String[] input={"techno","credits","krishna","advika"};
		Assignment18_Program_2 assignment18_Program_2= new Assignment18_Program_2();
		String[] output = assignment18_Program_2.getReverseStringReverseArray(input);
		System.out.println("Reverse all elements of an Array"+Arrays.toString(input)+" place it in a reverse order");

		System.out.println("Reverse Array Elements: "+Arrays.toString(output));
		}
	}

