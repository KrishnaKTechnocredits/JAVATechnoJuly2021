package prerana;

import java.util.Arrays;

public class Assignment18 {
	
	String[] reverseAtSamePosition(String[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			input[i]=reverseString(input[i]);
		}
		return input;
	}
	
	String[] reverseAtReversePosition(String[] input)
	{
		String[] reverse = new String[input.length];
		for(int i=0;i<input.length;i++)
		{
			input[i]=reverseString(input[i]);			
		}
		for(int j=0;j<input.length;j++)
		{
			reverse[j]=input[input.length-j-1];
		}
		return reverse;
	}
	
	
	static String reverseString(String input)
	{
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			output+=input.charAt(i);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment18 a=new Assignment18();
		String[] input1 = {"madhvi","surbhi","neha","sandesh","ankit","vaibhav"};
		String[] answer1=a.reverseAtSamePosition(input1);
		System.out.println("Reverse at same position "+Arrays.toString(answer1));
		String[] input2 = {"techno","credits","krishna","harsh"};
		String[] answer2=a.reverseAtReversePosition(input2);
		System.out.println("Reverse at reverse position "+Arrays.toString(answer2));		
		
	}

}
