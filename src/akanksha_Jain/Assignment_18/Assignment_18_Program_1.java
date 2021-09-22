/* Assignment - 18 : 19th Aug'21                                                                             	
Program 1 : Reverse all elements of an array at same position 
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]
Note : you can print array content directly using sop(Arrays.toString(output)); toString() method of Arrays class return String.
Method should take String array and return String array.
*/

package akanksha_Jain.Assignment_18;
import java.util.Arrays;

public class Assignment_18_Program_1 {

	String getReverseString(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}
	
	String[] getReverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for(int index=0; index<input.length; index++) {
			output[index] = getReverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		Assignment_18_Program_1 assignment_18_program_1 = new Assignment_18_Program_1();
		String[] output = assignment_18_program_1.getReverseStringArray(input);
		System.out.println("Reverse all elements of an array " + Arrays.toString(input) + " at the same position- ");
		System.out.println("Output:- " + Arrays.toString(output));
	}
}
