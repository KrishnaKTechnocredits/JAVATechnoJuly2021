package laxman;

import java.util.ArrayList;

//Assignment - 44 : 1st  Oct'2021 
//Find out the max number from an ArrayList.
//input: [10,7,99,53,74]
//output: 99

public class Assignment44 {

	void maxNumber() {
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		int max = 0;
		for (Integer i : al) {
			if (i > max)
				max = i;

		}
		System.out.println("Max Number from the Array is " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment44 assignment44 = new Assignment44();
		assignment44.maxNumber();
	}

}
