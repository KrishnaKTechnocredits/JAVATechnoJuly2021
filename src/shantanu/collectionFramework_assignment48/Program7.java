package shantanu.collectionFramework_assignment48;

import java.util.HashMap;

public class Program7 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,3,1,5,6,4};
		
		HashMap<Integer,Integer> hm = new HashMap();
		for(int index = 0; index < arr.length; index++) {
			if(hm.containsKey(arr[index]))
				hm.put(arr[index], hm.get(arr[index])+1);
			else
				hm.put(arr[index], 1);
		}
		System.out.println("Frequency of each number is: ");
		System.out.println(hm);
	}
}
