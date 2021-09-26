/*Program 1 : Reverse all elements of an array at same position  
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]

Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String. 

Method should take String array and return String array.*/
package elizabeth;
import java.util.Arrays;

class ArrayProgram12{
	
	String getReverseString(String input){
		String output="";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
		}
		return output;
	}
	
	String[] getReverseArrayReverseOrder(String[] input){
		for(int index=0;index<=input.length-1;index++){
			input[index]=getReverseString(input[index]);	
		}
		return input;
	}
	
	public static void main(String[] args){
		ArrayProgram12 arrayProgram12=new ArrayProgram12();
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "eliza"};
		System.out.println("Reversed all elements of an array and placed it in the same position: ");
		System.out.println(Arrays.toString(arrayProgram12.getReverseArrayReverseOrder(input)));
		
	}
}


