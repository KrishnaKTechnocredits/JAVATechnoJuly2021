package precilla.assignment46;

import java.util.Arrays;
import java.util.LinkedList;
//Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
public class Program8 {
	public static void main(String[] args) {
		int[] arr= {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		LinkedList<Integer> ll=new LinkedList<Integer>();
		System.out.println("input : "+Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<0) {
				if(!ll.contains(arr[index]))
					ll.add(arr[index]);
			}
				
		}
		System.out.println("Output : "+ll);
		
	}
}
