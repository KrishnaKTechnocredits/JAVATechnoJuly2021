/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
package shalaka.Assignment44;

import java.util.ArrayList;

public class MaxNumberFromArrayList {
	int getMaxNumber(ArrayList<Integer> num) {
		int maxNum = 0;
		for (int index = 0; index < num.size(); index++) {
			if (num.get(index) > maxNum) {
				maxNum = num.get(index);
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumberFromArrayList maxNumberFromArrayList = new MaxNumberFromArrayList();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(99);
		num.add(55);
		System.out.println("The max number from an ArrayList is: " + maxNumberFromArrayList.getMaxNumber(num));
	}

}
