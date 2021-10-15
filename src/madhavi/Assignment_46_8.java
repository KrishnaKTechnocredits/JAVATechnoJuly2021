package madhavi;

import java.util.Arrays;
import java.util.*;  

//Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
public class Assignment_46_8 {
	public static void main(String[] args) {
		int[] arr = { 10, -11, 13, -11, 14, -19, -99, -11, -19, 33 };
		System.out.println("An initial array of elements" + Arrays.toString(arr));
		LinkedList<Integer> negativeLinkedList = new LinkedList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < 0)
			{
				if(!negativeLinkedList.contains(arr[i]))
					negativeLinkedList.add(arr[i]);
			}
		}
		System.out.println("Output Linked List - " +negativeLinkedList);
	}
}
