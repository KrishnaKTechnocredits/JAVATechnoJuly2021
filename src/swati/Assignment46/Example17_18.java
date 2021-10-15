package swati.Assignment46;

import java.util.*;

/*
 * Example 17:
Write a program to add element at particular index of ArrayList?

Example 18:
Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method).
 */
public class Example17_18 {
	
	void addElement(Integer[] input,int element,int index) {
		ArrayList <Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		System.out.println("Before adding Element:"+list1);
		list1.add(index, element);
		System.out.println("After adding Element:"+list1);
	}
	
	void removeObjectFromArrayList(Integer[] input) {
		ArrayList <Integer> list1=new ArrayList<Integer>(Arrays.asList(input));
		Integer removeNum=10;
		list1.remove(removeNum);
		System.out.println(list1);
	}

	public static void main(String[] a) {
		Example17_18 e1=new Example17_18();
		Integer[] input= {10,20,11,15,16};
		e1.addElement(input,50,0);
		e1.removeObjectFromArrayList(input);
	}
}

