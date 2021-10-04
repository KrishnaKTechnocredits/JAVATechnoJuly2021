package shreya_assignment_44_max_number_from_arraylist;

import java.util.ArrayList;

public class MaxNoFromArrayList {
	void getMaxNo() {
		ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(99);
        arr.add(53);
        arr.add(74);
        int max=arr.get(0);
        for (int index = 1; index < arr.size(); index++) {
            if (arr.get(index) > max) {
                max = arr.get(index);
                System.out.println("Maximum Number From ArrayList is: "+max);
            }
        }
	}
	public static void main(String[] args) {
		MaxNoFromArrayList maxNoFromArrayList=new MaxNoFromArrayList();
		maxNoFromArrayList.getMaxNo();

	}

}
