/*Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11]
*/

package amol_Pawar.assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_9 {

	void geTMergedList(List<Integer> inputList1,List<Integer> inputList2)
	{
		
		inputList2.removeAll(inputList1);
		inputList1.addAll(inputList2);
		System.out.println(inputList1);
	}
	public static void main(String[] args) {
		Program_9 program_9=new Program_9();
		Integer arr[]= {10, 19, 33, 44, 12};
		List<Integer> inputList1=new ArrayList(Arrays.asList(arr));
		Integer arr1[]= {19, 99, 110, 11,10};
		List<Integer> inputList2=new ArrayList(Arrays.asList(arr1));	
		program_9.geTMergedList(inputList1, inputList2);
		

	}

}
