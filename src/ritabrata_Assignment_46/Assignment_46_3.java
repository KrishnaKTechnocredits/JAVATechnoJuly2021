/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).
*/

package ritabrata_Assignment_46;

import java.util.ArrayList;

public class Assignment_46_3 {
	void removeDuplicate(ArrayList<Integer> input) {
		for(int index=0; index<input.size();index++) {
			if(input.indexOf(input.get(index)) != input.lastIndexOf(input.get(index)))
				input.remove(input.get(index));
		}
		System.out.println("ArrayList after removing duplicates : " +input);
	}

	public static void main(String[] args) {
		Assignment_46_3 intArrList = new Assignment_46_3();
		ArrayList<Integer> inputArray = new ArrayList<Integer>();
		inputArray.add(20);
		inputArray.add(40);
		inputArray.add(60);
		inputArray.add(60);
		inputArray.add(50);
		System.out.println("ArrayList before removing duplicates : " +inputArray);
		intArrList.removeDuplicate(inputArray);
	}
}



