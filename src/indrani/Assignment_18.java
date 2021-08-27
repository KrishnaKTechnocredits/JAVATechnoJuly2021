package indrani;
import java.util.Arrays;

public class Assignment_18{
	
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
		Assignment_18 program1=new Assignment_18();
		String[] input = {"indrani", "neha", "nisha", "andy", "ankit", "rita"};
		System.out.println("Reversed all elements of an array and placed it in the same position: ");
		System.out.println(Arrays.toString(program1.getReverseArrayReverseOrder(input)));

	}
}

