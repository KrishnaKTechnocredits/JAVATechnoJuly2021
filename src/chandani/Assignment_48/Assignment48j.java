/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

package chandani.Assignment_48;

import java.util.ArrayList;

public class Assignment48j {

	void appendZeroAfterConsecutiveNumber(int[] input) {
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		for(int index=0; index<input.length;index++) {
			inputList.add(input[index]);
		}
		for(int index=0; index<inputList.size()-2;index++) {
			if((inputList.get(index) == inputList.get(index+1)-1) && (inputList.get(index+1) == inputList.get(index+2)-1))
				inputList.add(index+3, 0);
		}

		System.out.println(inputList);
	}

	public static void main(String[] args) {
		Assignment48j Assignment48j = new Assignment48j();
		int[] input = {1,2,3,5,4,7};
		Assignment48j.appendZeroAfterConsecutiveNumber(input);
	}
}