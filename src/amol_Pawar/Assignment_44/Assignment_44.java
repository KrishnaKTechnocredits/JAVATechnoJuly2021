package amol_Pawar.Assignment_44;

import java.util.ArrayList;
import java.util.List;

public class Assignment_44 {

	void getMaxNum(List input) {
		int max = (int) input.get(0);
		for (int index = 0; index < input.size(); index++) {
			int num = (int) input.get(index);
			if (max < num) {
				max = num;
			}
		}
		System.out.println("Maximum number in given List " + input + " is : " + max);
	}

	public static void main(String[] args) {
		Assignment_44 assignment_44 = new Assignment_44();
		List<Integer> alList = new ArrayList<Integer>();
		alList.add(10);
		alList.add(7);
		alList.add(99);
		alList.add(53);
		alList.add(74);
		assignment_44.getMaxNum(alList);
	}

}
