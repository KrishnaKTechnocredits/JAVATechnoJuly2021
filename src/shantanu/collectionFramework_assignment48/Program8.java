package shantanu.collectionFramework_assignment48;

import java.util.HashMap;

public class Program8 {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		String[] arrInput = input.split(" ");
				
		HashMap<String, Integer> map = new HashMap<>();
		for (String str : arrInput) {
			if (map.containsKey(str))
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		String keyMax = "";
		String keySecondmax = "";
		int maxNo = 0;
		int secondMax = 0;
		for (String str : map.keySet()) {
			if (map.get(str) > maxNo) {
				keySecondmax = keyMax;
				keyMax = str;
				secondMax = maxNo;
				maxNo = map.get(str);
			} else if (map.get(str) > secondMax && map.get(str)<maxNo) {
				keySecondmax = str;
				secondMax = map.get(str);
			}
		}
		System.out.println(keySecondmax + "->" + map.get(keySecondmax));
	}
}
