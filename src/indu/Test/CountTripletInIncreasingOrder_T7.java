/*Program 1: Count the number of triplets in increasing order. [expected time : 10 mins]

input : 10,9,11,6,23,25,22,66,34
ouput : 1
hint : 6,23,25 */

package indu.Test;

import java.util.Arrays;

public class CountTripletInIncreasingOrder_T7 {
	
	void countOfTriplet(int[] input)
	{
		int count =0;
		for(int index=0;index<input.length-2;index++)
		{
			if((input[index])<input[++index] && input[++index]<input[2+index])
			{
				count++;
			}
		}
		
		System.out.println("The count of Incresing triplet of aaray :\n"+Arrays.toString(input)+" is : "+count);
	}
	public static void main(String[] args) {
		CountTripletInIncreasingOrder_T7 countTripletInIncreasingOrder_T7 = new CountTripletInIncreasingOrder_T7();
		int [] input = {10,9,11,6,23,25,22,66,34};
		countTripletInIncreasingOrder_T7.countOfTriplet(input);
	}
}
