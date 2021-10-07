/*Example 8:
Return all negative numbers (remove duplicates if any and maintain insertion order) from given array.
Input : 10, -11, 13, -11, 14, -19, -99, -11, -19, 33
Output : [-11, -19, -99]
Hint : parameter - Array, return type - LinkedList*/


package ritabrata_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Assignment_46_8 {
	LinkedList<Integer> getNegative(Integer[] input){
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(input));
		LinkedList<Integer> negNumList = new LinkedList<Integer>();
		for(int index=0; index<list.size();index++) {
			if(list.get(index) < 0 )
				if(index == list.indexOf(list.get(index)))
					negNumList.add(list.get(index));				
		}
		return negNumList;
	}

	public static void main(String[] args) {
		Assignment_46_8 negNum = new Assignment_46_8();
		Integer[] input = {10, -11, 13, -11, 14, -19, -99, -11, -19, 33};
		System.out.println("The negative numbers are: "+negNum.getNegative(input));
	}

}
