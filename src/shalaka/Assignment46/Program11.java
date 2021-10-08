/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]*/
package shalaka.Assignment46;

import java.util.ArrayList;

public class Program11 {
	ArrayList<Integer> getMissingNum(ArrayList<Integer> list) {
		ArrayList<Integer> outputList = new ArrayList<>();
		for (int index = 1; index <= 10; index++) {
			if (!list.contains(index))
				outputList.add(index);
		}
		return outputList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program11 program11 = new Program11();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(3);
		list.add(10);
		System.out.println(list);
		System.out.println("The missing numbers: " + program11.getMissingNum(list));
	}

}
