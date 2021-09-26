
package indu.Assignment_31;

import java.util.Arrays;

public class CountOfTripletSequence {

	int count =0;
	void findTripletSequence(int [] input)
	{
		int temp;
			int index=0 ;
			
			while(index<input.length-2)
			{
				temp=input[index];
				if((temp+1)==input[index+1] && (2+temp)==input[index+2])
				count++;	
				index++;	
			}
		System.out.println("Count of Triplet Sequence is : "+count);	
	}
	
	public static void main(String[] args) {
		CountOfTripletSequence countOfTripletSequence = new CountOfTripletSequence();
		int[] input = {10,11,11,22,23,24,25,43,44,60,61,62};
		System.out.println("Input array is :\n"+Arrays.toString(input));
		countOfTripletSequence.findTripletSequence(input);
	}
}
