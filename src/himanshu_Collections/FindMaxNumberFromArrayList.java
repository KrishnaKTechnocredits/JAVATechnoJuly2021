package himanshu_Collections;

import java.util.ArrayList;

public class FindMaxNumberFromArrayList {

	void maxNumber(ArrayList<Integer> al) {
		int max = al.get(0);

		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) > max) {
				max = al.get(index);
			}
		}
		System.out.println("Maximum Number From Array List : " + max);
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(99);
		al.add(53);
		al.add(74);
		// System.out.println(al);

		FindMaxNumberFromArrayList ex = new FindMaxNumberFromArrayList();
		ex.maxNumber(al);

	}

}
