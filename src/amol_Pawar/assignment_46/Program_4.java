/*Write a program to remove duplicate from ArrayList (using set).
Make sure element order remain same.*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program_4 {

	void removeDuplicateNum(List<Integer> inputList)
	{
		LinkedHashSet setList=new LinkedHashSet<>();
		for(Integer input:inputList)
		{
			setList.add(input);
		}
		System.out.println("Element  before removing duplicates numbers : "+inputList);
		System.out.println("Element after removing duplicates numbers   : "+setList);
	}
	public static void main(String[] args) {
		Program_4 program_4 = new Program_4();
	
		
		Integer arr[] = { 3, 4, 2, 4, 5, 23, 5, 5 };
		List<Integer> inputList = Arrays.asList(arr);
		program_4.removeDuplicateNum(inputList);

	}

}
