package madhavi;

import java.util.ArrayList;

public class Assignment_44 {
	int getMaxnumber(ArrayList<Integer> a1) {
		int max = a1.get(0);
		for (int i = 0; i < a1.size(); i++) {
			if (a1.get(i) > max) {
				max = a1.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment_44 assignment_44 = new Assignment_44();
		System.out.println("Print the max number from an ArrayList.");
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(7);
		a1.add(99);
		a1.add(53);
		a1.add(74);
		System.out.println(assignment_44.getMaxnumber(a1));
	}

}
