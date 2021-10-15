/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.
*/


package ritabrata_Assignment_46;

import java.util.ArrayList;

public class Assignment_46_11 {
	ArrayList<Integer> getMissingNumber(ArrayList<Integer> list){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index=1; index<=10; index++) {
			if(!list.contains(index))
				output.add(index);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_46_11 getMissing = new Assignment_46_11();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(3);
		list.add(10);
		System.out.println("The missing list is: "+getMissing.getMissingNumber(list));
	}

}
