package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/
public class RemoveDuplicateWithoutUsingSet {

	static void getRemoveDuplicate(ArrayList<Integer> input) {
	ArrayList<Integer> list = new ArrayList<>();
	for(int num : input)
		if(!list.contains(num)) {
			list.add(num);
		}
	System.out.println("Removed list is : "+list);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list =  new ArrayList<>(Arrays.asList(23,45,34,38,45,23,56,78,89,67,62));
		System.out.println("Given list is : " + list);
		getRemoveDuplicate(list);
	
	}

}
 