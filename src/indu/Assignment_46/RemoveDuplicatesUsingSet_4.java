/*Example 4:  
Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/
package indu.Assignment_46;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet_4 {

	public static void main(String[] args) 
	{
		Integer[] arrNum= {1,33,4,55,11,1,4,5};
		System.out.println("Arraylist with duplicates    : "+Arrays.toString(arrNum));
		removeDuplicate(arrNum);
	}

	 static void removeDuplicate(Integer[] arrNum)
	 {
		 LinkedHashSet<Integer> hashNum = new LinkedHashSet<>(Arrays.asList(arrNum));
		 System.out.println("Arraylist without duplicates : "+hashNum);
	 }
}
