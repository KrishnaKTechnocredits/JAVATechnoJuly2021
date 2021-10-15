package margi.Assignment_48;

import java.util.ArrayList;

/*append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/

public class Assignment_48_10 {

	void getData(Integer[] input) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (index < input.length - 1) {
				if (((num + 1) == input[index + 1]) && ((num + 2) == input[index + 2])) {
					list.add(num);
					list.add(num + 1);
					list.add(num + 2);
					list.add(0);
					index += 2;
				} else
					list.add(num);
			}
			else
				list.add(num);
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		Assignment_48_10 assignment_48_10 = new Assignment_48_10();
		Integer[] input = { 1, 2, 3, 5, 4, 7 };
		assignment_48_10.getData(input);
	}
}
