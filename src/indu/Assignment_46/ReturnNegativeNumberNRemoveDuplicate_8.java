/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ReturnNegativeNumberNRemoveDuplicate_8 
{
	static LinkedHashSet<Integer> getNegativeNumber(Integer[] arr)
	{
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Input Array is :\n"+alist);
		LinkedHashSet<Integer> lset = new LinkedHashSet<>();
		for(int num:alist)
		{
			if(num<0)
			{
				lset.add(num);
			}
		}
		return lset;
	}
	public static void main(String[] args)
	{
		Integer[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("After Removing negative and Duplicate Array is : \n"+getNegativeNumber(arr));
	}
}
