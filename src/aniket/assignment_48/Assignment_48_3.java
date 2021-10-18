package aniket.assignment_48;

/*program 3: print all the numbers having freq 1.
input : [1,11,33,22,22,11,1,9,7,7];
ouput : 33,9
Hint : Map*/


import java.util.Arrays;
import java.util.HashMap;

public class Assignment_48_3 {

	void getArraywithFreq1(int[] input)
	{
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int num :input)
		{
			if(hmap.containsKey(num))
			{
				hmap.put(num, hmap.get(num)+1);
			}
			else
			{
				hmap.put(num,1);
			}
		
		}
		System.out.println(hmap);
		System.out.println("Numbers with frequency 1 in array:\n"+Arrays.toString(input)+" : ");
		for (int key : hmap.keySet()) {
			if (hmap.get(key) == 1)
				
				System.out.print(key + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Assignment_48_3 a48_3 = new Assignment_48_3();
		int input[] = {1,11,33,22,22,11,1,9,7,7};
		a48_3.getArraywithFreq1(input);
		
	}
}

