/*Program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];*/

package parthav.parthavD_Assignment48;

import java.util.ArrayList;
import java.util.Arrays;

public class Program10 {

	void appendZeroInArrayList(Integer[] inputArr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int index = 0; index < inputArr.length;index++) {
			if (index + 2 < inputArr.length) {
				if ((inputArr[index] + 2 == inputArr[index + 2]) && (inputArr[index] + 1 == inputArr[index + 1])) {
					list.add(inputArr[index]);
					list.add(inputArr[index + 1]);
					list.add(inputArr[index + 2]);
					list.add(0);
					index += 2;
				}
			 else {
				list.add(inputArr[index]);
			}
			}
			else
				list.add(inputArr[index]);
				

		}

		System.out.println(list);

	}

	public static void main(String[] args) {
		Program10 newObj = new Program10();
		Integer[] inputArr = { 1, 2, 3, 5, 4, 7 };
		newObj.appendZeroInArrayList(inputArr);

	}

}
