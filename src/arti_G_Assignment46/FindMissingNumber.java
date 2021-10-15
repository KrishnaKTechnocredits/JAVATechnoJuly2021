package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/
public class FindMissingNumber {

	static ArrayList<Integer> findMissingNumber(ArrayList<Integer> input){
		ArrayList<Integer> list = new ArrayList();
		for(int index=1;index<=10;index++) {
			if(!input.contains(index))
				list.add(index);
		}
		return list;
	}
	public static void main(String[] args) {
		Integer[] input = {1,6,2,5,7,6,3,10};
		ArrayList<Integer> list =  new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(findMissingNumber(list));
	}

}
