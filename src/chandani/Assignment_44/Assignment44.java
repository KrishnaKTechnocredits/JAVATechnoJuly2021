package chandani.Assignment_44;

import java.util.ArrayList;

public class Assignment44 {
	
	int getMaxNumber(ArrayList<Integer> num) {
		int maxnum = 0;
		for(int index = 0; index < num.size(); index++) {
			if(num.get(index) > maxnum) {
				maxnum = num.get(index);
				}
			}
		return maxnum;
	}

	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(99);
		num.add(55);
		System.out.println("Maximum number from the ArrayList is " + assignment44.getMaxNumber(num));
	}
	
}
