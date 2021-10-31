package sayli_Vyavhare.Assignment_48;

//program 7 : find the freq of each number in given array.
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Program_7 {
	static void frequencyNumber(Integer[] input) {
		LinkedList<Integer> al = new LinkedList<Integer>(Arrays.asList(input));
		HashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		for (int data : al) {
			if (hm.containsKey(data))
				hm.put(data, hm.get(data) + 1);
			else
				hm.put(data, 1);

		}
		System.out.println("freq of each number in given array"+ hm);
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 4, 0, 50, 60, 60, 70, 0, 10, 4, 50, 60, 60 };
		frequencyNumber(input);
	}

}
