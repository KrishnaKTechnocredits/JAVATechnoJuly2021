package chirag.assignment46;

import java.util.Arrays;
import java.util.LinkedList;

/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Ouput : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/

public class ReturnAllNegativeNumbers {
	
	LinkedList<Integer> getReturnNegetiveNumbersFromGivenArray(LinkedList<Integer> input){
		LinkedList<Integer> list1=new LinkedList<>();
		for(int num : input) {
			if(!list1.contains(num))
			if(num < 0) {
				list1.add(num);
			}
		}
		return list1;
	}
	
	public static void main(String[] args) {
		ReturnAllNegativeNumbers returnAllNegativeNumbers=new ReturnAllNegativeNumbers();
		Integer [] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		LinkedList<Integer> list = new LinkedList<>(Arrays.asList(input));
		System.out.println(returnAllNegativeNumbers.getReturnNegetiveNumbersFromGivenArray(list));
	}
}
