package arti_G_Assignment46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 12 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/
public class RemoveAllZeros {

	static ArrayList<Integer> removeAllZeros(ArrayList<Integer> input){
		while(input.contains(0)) {
			input.remove(new Integer(0));
		}
		return input;
	}
	public static void main(String[] args) {
		Integer[] input = {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		System.out.println(removeAllZeros(list));
	}
}
