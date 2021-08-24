
package somnath;
import java.util.Arrays;
public class ReverseStringAssignment18_2 {

	String getReverseString(String input){
		String output="";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
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
		String[] input={"techno","credits","krishna","harsh"};
		ReverseStringAssignment18_2 reverseAssignment2= new ReverseStringAssignment18_2();
		String[] output = reverseAssignment2.getReverseStringReverseArray(input);
		System.out.println("------------------------------------------------------------------------");
        System.out.println("\n Reverse all elements of an Array"+Arrays.toString(input)+" place it in a reverse order");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\n Reverse Array Elements: "+Arrays.toString(output));
	    System.out.println("--------------------------------------------------------------------------");

	}

} 
 