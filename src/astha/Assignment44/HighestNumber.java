package astha.Assignment44;

import java.util.ArrayList;

public class HighestNumber {

	int getHighestNumber(ArrayList<Integer> input) {
		int highestNum = input.get(0);
		for(int index=1; index<input.size(); index++) {
			if(input.get(index) > highestNum)
				highestNum = input.get(index);
		}
		return highestNum;
	}
	
	public static void main(String[] args) {
		HighestNumber highestNumber = new HighestNumber();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(20);
		input.add(500);
		input.add(300);
		input.add(30);
		System.out.println("The highest number in the list is : " +highestNumber.getHighestNumber(input));
	}
}
