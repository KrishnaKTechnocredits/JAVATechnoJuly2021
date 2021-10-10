package suruchi.Assignment44;

import java.util.ArrayList;

public class Program_A44 {

	void printMaxNumInArrayList(ArrayList<Integer> al) {
		int maxNum = 0;
		for (int index : al) {
			if (index > maxNum)
				maxNum = index;
		}
		System.out.println("Maximum number from the arraylist is: " + maxNum);
	}

	public static void main(String[] args) {
		Program_A44 program_A44 = new Program_A44();

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);

		System.out.println("ArrayList is: " + al);
		program_A44.printMaxNumInArrayList(al);
	}
}