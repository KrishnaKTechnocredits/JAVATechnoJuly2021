package madhavi;

import java.util.Arrays;
import java.util.HashMap;

//find the freq of each number in given array.
public class Assignment_48_7 {
	
	void getFreqOfNumber(int[] inputArr) {
		HashMap<Integer, Integer> strmap = new HashMap<Integer, Integer>();
		
		for (int number : inputArr) {

			if (strmap.containsKey(number))
				strmap.put(number, strmap.get(number) + 1);
			else
				strmap.put(number, 1);
		}
		System.out.println("freq of each number in given array-"+Arrays.toString(inputArr)+ "->" + strmap);
		System.out.println( strmap);
	}
	
	public static void main(String[] args) {
		Assignment_48_7 assignment_48_7 = new Assignment_48_7();
		int[] inputArrray = {1,11,33,22,22,11,1,9,7,7};
		assignment_48_7.getFreqOfNumber(inputArrray);

	}

}
