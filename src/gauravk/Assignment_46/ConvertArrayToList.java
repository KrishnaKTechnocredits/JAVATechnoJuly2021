package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 15:
Write a program to convert Array to List.

 */
public class ConvertArrayToList {
	
	void convertStringArrayToList(String[] st) {
		List<String> lst = new ArrayList<>(Arrays.asList(st));
		System.out.println(lst);
	}
	
	void convertIntegerArrayToList(int[] num) {
		Integer[] num1 = new Integer[num.length];
		for(int i=0; i<num.length; i++) {
			num1[i]=num[i];
		}
		List<Integer> lst = new ArrayList<>(Arrays.asList(num1));
		System.out.println(lst);
	}
	
	public static void main(String[] args) {
		int[] numbers = {400,20,54,15,27,99,12,15,62,67,37,19,20,100,99};
		String[] strArray = {"Hi","Hello","Hi","Techno","Credits","Hi","Credits"};
		ConvertArrayToList atl = new ConvertArrayToList();
		atl.convertIntegerArrayToList(numbers);
		atl.convertStringArrayToList(strArray);
	}
}
