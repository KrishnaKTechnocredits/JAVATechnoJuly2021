/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsGivenNumDuplicate_46_2 {

	static boolean isNumDuplicate(Integer[] arrNum,int num)
	{
		List<Integer> list = Arrays.asList(arrNum);
		ArrayList<Integer> listNUm= new ArrayList<Integer>(list);
		//int count=0;
		boolean flag = true;
		for(int index=0;index<listNUm.size();index++)
		{
			if(listNUm.indexOf(num)==listNUm.lastIndexOf(num))
			{
				flag=false;
				
			}
			else
			{
				flag=true;
				System.out.println("\n"+num+" is a duplicate number.");
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println("\n"+num+" is not a duplicate number");
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Integer[] arrNum= {1,33,4,55,11,1,4,5};
		System.out.println("Input list is :"+Arrays.toString(arrNum));
		isNumDuplicate(arrNum,4);
		isNumDuplicate(arrNum,55);
	}
}
