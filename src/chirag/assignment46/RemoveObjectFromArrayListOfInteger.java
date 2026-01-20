package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to remove Object from ArrayList of Integer (using remove(Object obj) method)

public class RemoveObjectFromArrayListOfInteger {
	
	public static void main(String[] args) {
		Integer [] input = {2,3,4,5,6,7,8,9};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(input));
		System.out.println("Before removing a element : "+al);
		al.remove(3);
		System.out.println("After removing a element at index 3 : "+al);	
	}
}
