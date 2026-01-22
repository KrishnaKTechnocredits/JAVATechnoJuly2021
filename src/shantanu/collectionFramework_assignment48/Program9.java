package shantanu.collectionFramework_assignment48;

import java.util.LinkedHashMap;

public class Program9 {
	public static void main(String[] args) {
		String input = "Hi Hello Hi Techno Credits Hi Credits";
		String[] arrInput = input.split(" ");
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String str : arrInput) {
			if (map.containsKey(str)) 
				map.put(str, map.get(str) + 1);
			else
				map.put(str, 1);
		}
		for (String str : map.keySet()) {
			if (map.get(str) == 1) {
				System.out.println(str);
				break;
			}
		}
	}
}
