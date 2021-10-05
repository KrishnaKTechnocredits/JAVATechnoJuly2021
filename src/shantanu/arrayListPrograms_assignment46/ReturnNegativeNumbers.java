package shantanu.arrayListPrograms_assignment46;

import java.util.LinkedHashSet;

/*Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.*/
public class ReturnNegativeNumbers {
	LinkedHashSet<Integer> getNegativeNumbers(int[] arr){
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		for(int num : arr) {
			if(num < 0)
				setOfNumbers.add(num);
		}
		return setOfNumbers;
	}
	public static void main(String[] args) {
		int[] arr = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		ReturnNegativeNumbers returnNegativeNumbers = new ReturnNegativeNumbers();
		System.out.println("Negative numbers from array:");
		System.out.println(returnNegativeNumbers.getNegativeNumbers(arr));
	}
}
