package aniket.assignment_48;

/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Assignment_48_11 {

	static int arr[] = {1,22,8,99,99,1,22,69,36,45};
	static Integer arr1[] = {1,22,8,99,99,1,22,69,36,45};

	static void findDuplicates()
	{
		System.out.println("Input array is\n"+Arrays.toString(arr));
		System.out.print("Duplicate numbers in array :");
		for(int i =0 ;i<arr.length;i++)
		{
			for(int j =i+1 ;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					
				}
			}		
		}
	}
	
	static void findDuplicateArrayList()
	{
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> output = new ArrayList<>();
		for(int num : arr1)
		{
			if(!output.contains(num) && (alist.indexOf(num) != alist.lastIndexOf(num)))
			{
				output.add(num);
			}
		}
		System.out.println("\nDuplicates ussing ArrayList :"+output);
	}
	
	static void findDuplictaesUsingSet()
	{
		LinkedHashSet<Integer> tset = new LinkedHashSet<>();
		System.out.println("Duplicates using set : ");
		for (int num : arr1) {
			if (!tset.add(num))
				System.out.print(num+" ");
		}
		
	}
	
	static void findDuplictaesUsingMap()
	{
		LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<>();
		for(Integer num : arr1)
		{
			if(lmap.containsKey(num))
			{
				lmap.put(num,lmap.get(num)+1);
			}
			else
			{
				lmap.put(num, 1);
			}
		}
		System.out.println("\nDuplicates using map : ");
		for(Integer key :lmap.keySet())
		{
			if(lmap.get(key)!= 1)
			{
				System.out.print(key+" ");
			}
		}
	}
	public static void main(String[] args) {
		findDuplicates();
		findDuplicateArrayList();
		findDuplictaesUsingSet();
		findDuplictaesUsingMap();
	}
}

