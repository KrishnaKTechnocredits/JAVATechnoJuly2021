package monali.Assignment_48;

import java.util.LinkedHashMap;
import java.util.Map;

/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/

public class Program3 {

	void getNumberHavingFreqMoreThanOne(Integer[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : arr) {
			if (map.containsKey(num))
				map.put(num, map.get(num) + 1);
			else
				map.put(num, 1);
		}
		for (Integer number : map.keySet()) {
			if (map.get(number) == 1)
				System.out.println(number + "-" + map.get(number));
		}
	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 30, 20, 40, 19, 10, 40, 10, 19 };
		Program3 p3 = new Program3();
		p3.getNumberHavingFreqMoreThanOne(arr);
	}
}
