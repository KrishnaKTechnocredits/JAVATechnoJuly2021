package monali.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

/*Example 11 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.
*/
public class Program10 {

	ArrayList<Integer> getMissingFromSeries(Integer arr[]) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> output = new ArrayList<>();
		for (int index = 1; index <= 10; index++) {
			if (!list.contains(index))
				output.add(index);
		}

		return output;
	}

	public static void main(String[] args) {
		Integer arr1[] = { 1, 6, 2, 5, 7, 6, 3, 10 };
		Program10 p10 = new Program10();
		System.out.println("Missing numbers between 1 to 10 : \n" + p10.getMissingFromSeries(arr1));
	}
}
