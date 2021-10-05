/*Example 16:
Write a program to add element at particular index of ArrayList?.*/

package amol_Vyas.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Program_16 {

	static void  addElementParticularIndexArrayList(ArrayList<Integer> list, int index,int element) {
		list.add(index, element);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Integer[] input = { 19, 12, 18, 17, 23, 22 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(list);
		addElementParticularIndexArrayList(list, 1, 121);
		
	}
}
