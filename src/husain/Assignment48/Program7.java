package husain.Assignment48;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program7 obj = new Program7();
		int arr[] = { 1, 11, 33, 22, 22, 11, 1, 9, 7, 7 };
		obj.findFreq(arr);
	}

	private void findFreq(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int temp : arr)
			if (map.containsKey(temp))
				map.put(temp, map.get(temp) + 1);
			else
				map.put(temp, 1);
		System.out.println("The frequency of each number in the given array " + Arrays.toString(arr) + " is " + map);

	}

}
