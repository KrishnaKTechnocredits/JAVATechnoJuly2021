/*Program 2 : Reverse all elements and place it in a reverse order

String[] input = {"techno", "credits", "krishna","harsh"}
output : [hsrah, anhsirk, stiderc, onhcet]

Note : use sop(Arrays.toString(output)) to print the array content.*/
package elizabeth;
import java.util.Arrays;

class ArrayProgram13{
	
	String getReverseString(String input){
		String output="";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
		}
		return output;
	}
	
	String[] getReverseArrayReverseOrder(String[] input){
		String[] output=new String[input.length];
		int n=input.length-1;
		for(int index=0;index<=input.length-1;index++){
			output[index]=getReverseString(input[n]);
			n--;
		}
		return output;
	}
	
	public static void main(String[] args){
		ArrayProgram13 arrayProgram13=new ArrayProgram13();
		String[] input = {"techno", "credits", "krishna","harsh"};
		String[] output=arrayProgram13.getReverseArrayReverseOrder(input);
		System.out.println("Reversed all elements of an array and placed it in a reverse order: ");
		System.out.println(Arrays.toString(output));
	}
	
}