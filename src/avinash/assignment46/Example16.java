package avinash.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 16:
Write a program to add element at particular index of ArrayList?.*/
public class Example16 {
	
	static void addParticularElement(ArrayList<Integer> list, int index, int element) {
		list.add(index,element);
		System.out.println(list);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(arrayList);
		addParticularElement(arrayList,1,121);
	}

}
