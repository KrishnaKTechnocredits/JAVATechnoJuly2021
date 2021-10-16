package gauravk.Assignment_46;

import java.util.Arrays;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 2 :
Write a program to find given number is duplicate in arrayList.

 */
import java.util.*;

public class CheckIfNumIsDuplicateInArray {
	
	String IsNumDuplicate(Integer [] arr, int num) {
		//List<Integer> list = Arrays.asList(arr);
		ArrayList<Integer> arl = (ArrayList<Integer>)new ArrayList<Integer>(Arrays.asList(arr));
		
		if(arl.contains(num)) {
			if(arl.indexOf(num)!=arl.lastIndexOf(num))
				return ("Number "+num+" is duplicate and exist more than once in Numberset.");
			else
				return ("Number "+num+" only exist once in Numberset. It is not duplicate.");
		}else
			return ("Number "+num+" does not exist in Numberset.");
	}
	
	public static void main(String[] args) {
		Integer[] a = {12,15,88,46,79,99,1000,588,49,344,167,97,22,5,14,6,49,3,77,11,99,100};
		System.out.println("Number set : "+Arrays.toString(a));
		System.out.println(new CheckIfNumIsDuplicateInArray().IsNumDuplicate(a, 99));
	}
}