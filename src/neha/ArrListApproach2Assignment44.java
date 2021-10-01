package neha;

import java.util.ArrayList;

//Find maximum number from array list, approach 2
public class ArrListApproach2Assignment44 {
	int findAndDisplayMaxNoFromArrayList(ArrayList<Integer> arList) {
		int max = arList.get(0);
		for (int index = 1; index < arList.size(); index++) {
			if (max < arList.get(index))
				max = arList.get(index);
		}
		return max;
	}

	public static void main(String[] args) {
		ArrListApproach2Assignment44 arrList2 = new ArrListApproach2Assignment44();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(1);
		al.add(123);
		al.add(78);
		al.add(56);
		System.out.println("Maximum number from array list is " + arrList2.findAndDisplayMaxNoFromArrayList(al));

	}
}
