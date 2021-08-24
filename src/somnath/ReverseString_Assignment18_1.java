package somnath;
import java.util.Arrays;

public class ReverseString_Assignment18_1 {

	String getReverseString(String input) {
		String output="";
		for(int index=input.length()-1; index>=0; index--) {
			output+=input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] array) {
		String[] output=new String[array.length];
		for(int index=0; index<array.length; index++) {
			output[index]=getReverseString(array[index]);
		}
		return output;
	}
	public static void main(String[] args) {
		String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"};
		ReverseString_Assignment18_1 reverseAssignment1 = new ReverseString_Assignment18_1();
		String[] output = reverseAssignment1.getReverseStringArray(input);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("\n{ Reverse all elements of an array " + Arrays.toString(input) + " at same position }- ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("\n Output:- " + Arrays.toString(output));
	    System.out.println("--------------------------------------------------------------------------");
	}
}
 