package shantanu.collectionFramework_assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Program11 {
	static void arrayAndLoop(String str) {
		String[] arr = str.split(" ");
		String output = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != null)
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
					if (arr[index].equals(arr[innerIndex])) {
						output += arr[index] + " ";
						arr[innerIndex] = null;
						break;
					}
				}
		}
		System.out.println(output);
	}

	static void arrayList(String[] arr) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
		ArrayList<String> list2 = new ArrayList<>();
		for (int index = 0; index < list1.size(); index++) {
			if (!list2.contains(list1.get(index))
					&& list1.indexOf(list1.get(index)) != list1.lastIndexOf(list1.get(index)))
				list2.add(list1.get(index));
		}
		System.out.println(list2);
	}

	static void hashSet(String[] arr) {
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		for (String str : arr) {
			if (!set1.add(str)) {
				set2.add(str);
			}
		}
		System.out.println(set2);
	}

	static void hashMap(String[] arr) {
		String output = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String str : arr) {
			if (map.containsKey(str)) {
				int cnt = map.get(str);
				map.put(str, cnt + 1);
			} else
				map.put(str, 1);
		}
		for (String str1 : map.keySet()) {
			if (map.get(str1) != 1) {
				output += str1 + " ";
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Techno Credits Hi Credits";
		String[] arr = str.split(" ");
		Program11.arrayAndLoop(str);
		Program11.arrayList(arr);
		Program11.hashSet(arr);
		Program11.hashMap(arr);
	}
}
