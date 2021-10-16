package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Programming Questions - Collections : 4th Oct'2021

Example 11 : 
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.

 */
public class FindMissingNumbers {
	
	ArrayList<Integer> findMissingNumFromList(ArrayList<Integer> arl1){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// min and max borders of list.
		int minNumber = findStartBorder(arl1);
		int maxNumber = findFinishtBorder(arl1);
		
		//create list with min and max.
		while(minNumber<=maxNumber) {
			result.add(minNumber);
			minNumber++;
		}
		
		result.removeAll(arl1);
		return result;
	}
	
	int findStartBorder(ArrayList<Integer> list1){
		int minNum=1;
		for(int num : list1) {
			if(num<=minNum)
				minNum=num;
		}
		return minNum;
	}
	
	int findFinishtBorder(ArrayList<Integer> list1){
		int maxNum=0;
		for(int num : list1) {
			if(num>=maxNum)
				maxNum=num;
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,6,2,5,7,6,3,10));
		System.out.println("Input : "+input);
		System.out.println("Missing numbers. Output : "+new FindMissingNumbers().findMissingNumFromList(input));
	}
}
