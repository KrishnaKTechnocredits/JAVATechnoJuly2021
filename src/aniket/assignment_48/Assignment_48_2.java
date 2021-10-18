package aniket.assignment_48;

/*Program 2 : Find how many pairs of socks we can have from given array.

input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/


import java.util.Arrays;
import java.util.HashMap;

public class Assignment_48_2 {
 
	 int[] arr = {10,3,10,4,7,4,10,3,2,7};
	
	 void getPairs()
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int pair=0;
		for(int num : arr)
		{
			if(hmap.containsKey(num))
			{
				hmap.put(num,hmap.get(num)+1);
			}
			else
			{
				hmap.put(num,1);
			}
		}
		System.out.println(hmap);
		for(int key:hmap.keySet())
		{
			pair += hmap.get(key)/2;
		}
		System.out.println("The number of pair in array\n"+Arrays.toString(arr)+"  : "+pair);
	}
	
	public static void main(String[] args) {
		Assignment_48_2 a48_2 = new Assignment_48_2();
		a48_2.getPairs();
	}
}

