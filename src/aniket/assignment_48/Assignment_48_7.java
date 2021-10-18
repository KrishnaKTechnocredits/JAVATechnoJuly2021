package aniket.assignment_48;

/*program 7 : find the freq of each number in given array.*/



import java.util.Arrays;
import java.util.LinkedHashMap;

public class Assignment_48_7 {

	static void frequencyofEachNumber()
	{
		int arr[] = {1,22,33,45,89,99,99,11,22,33,99};
		LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();
		for(int num : arr)
		{
			if(lmap.containsKey(num))
			{
				lmap.put(num, lmap.get(num)+1);
			}
			else
			{
				lmap.put(num, 1);
			}
		}
		
		System.out.println("Frequency of each num in array \n"+Arrays.toString(arr)+" is : \n"+lmap);
		
	}
	public static void main(String[] args) {
		frequencyofEachNumber();
	}
}
