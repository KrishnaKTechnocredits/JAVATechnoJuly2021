/*Write a program to remove duplicate from ArrayList (without using set).*/
package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_3 {

	void removeDuplicateNum(List<Integer> inputList)
	{
		ArrayList<Integer> list=new ArrayList();
		for(int index=0;index<inputList.size();index++)
		{
			int num=inputList.get(index);
			if(!list.contains(num))
			{
				list.add(num);
			}
		}
		System.out.println("Element  before removing duplicates numbers : "+inputList);
		System.out.println("Element after removing duplicates numbers   : "+list);
	}
	public static void main(String[] args) {
		Program_3 program_3 = new Program_3();
		Integer arr[] = { 3, 4, 2, 4, 5, 23, 5, 5 };
		List<Integer> inputList = Arrays.asList(arr);
		int num = 4;
		program_3.removeDuplicateNum(inputList);

	}

}
