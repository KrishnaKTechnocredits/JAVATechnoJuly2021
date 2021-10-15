package swati.Assignment46;

import java.util.*;

/*
 * Example 9 : 
Write a program to return Union of two ArrayList without duplicates.
input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]
output : [10,19,33,44,12,99,110,11]
 */

public class Example9 {
	
	void retunUnion(Integer[] input1,Integer[] input2) {
		List <Integer> list1=new ArrayList<Integer>(Arrays.asList(input1));
		List <Integer> list2=new ArrayList<Integer>(Arrays.asList(input2));
		//List <Integer> output=new ArrayList<Integer>();
		list2.removeAll(list1);
		//System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		
	}
	public static void main(String[] a) {
		Example9 e1=new Example9();
		Integer[] input1= {10, 19, 33, 44, 12};
		Integer[] input2= {19, 99, 110, 11,10};
		e1.retunUnion(input1,input2);
		
	}

}

