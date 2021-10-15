/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicareFromArrayList_46_3 {

	static void removeDuplicate(Integer[] num)
	{
		ArrayList<Integer> listNUm= new ArrayList<Integer>(Arrays.asList(num));
		ArrayList<Integer> output= new ArrayList<Integer>();
		for(int digit :listNUm)
		{
			if(!output.contains(digit))
			{
				output.add(digit);
			}
		}
		System.out.println("Array without duplicates  : "+output);
	}
	public static void main(String[] args) 
	{
		Integer[] arrNum= {1,33,4,55,11,1,4,5};
		System.out.println("Arraylist with duplicates :"+Arrays.toString(arrNum));
		removeDuplicate(arrNum);
	}
}
