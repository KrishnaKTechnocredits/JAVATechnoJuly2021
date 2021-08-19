package anuja;

import java.util.Arrays;

public class Assignment_18 {
	
	String reverseString(String input) {
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output+=input.charAt(i);
			}
			return output;
	}
		
	String[] reverseStringArray(String[] input) {
		for(int i=0;i<input.length;i++) {
			String reverse=reverseString(input[i]);
			input[i]=reverse;
		}
		return input;
	}
		
	String[] reverseStringArray1(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String reverse = reverseString(input[i]);
			output[i] = reverse;
		}
		String temp[]=new String[output.length];
		for(int i=0;i<output.length/2;i++) {
			temp[i]=output[i];
			output[i]=output[output.length-1-i];
			output[output.length-1-i]=temp[i];
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input= {"madhvi","Surbhi","Neha","Sandesh","Ankit","Vaibhav"};
		Assignment_18 assignment_18= new Assignment_18();
		String[] ans=assignment_18.reverseStringArray(input);
		System.out.println(Arrays.toString(ans));
		String[] arr= {"techno","credits","krishna","harsh"};
		String[] answer=assignment_18.reverseStringArray1(arr);
		
		System.out.println(Arrays.toString(answer));
		}
	}



