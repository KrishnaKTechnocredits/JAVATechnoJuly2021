package aniket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Example 15: Write a program to convert Array to List.
public class Assignment_46_14 {
	
	void convertToList(String[] str) {
		List<String> list = new ArrayList<String>(Arrays.asList(str));
		System.out.println("Convert from array to list : " + list);
		
		
	}
	
	public static void main(String[] args) {
		
		String[] str = {"Aniket","Sonali","Monali","Vaibhav","Sunny","Satya"};
		Assignment_46_14 assignment_46_14 = new Assignment_46_14();
		assignment_46_14.convertToList(str);
	}
}

