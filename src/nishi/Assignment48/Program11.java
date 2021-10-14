/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/

package nishi.Assignment48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program11 {
	String findDuplicateUsingArray(int[] input)
	{
		String str="";	
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]==input[j])
				{
					str+=input[i]+" ";
					
				}
			}
		}
		return str;
	}
	
	ArrayList<Integer> getDuplicatesUsingList(Integer[] arr)
	{
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		ArrayList<Integer>newAl=new ArrayList<Integer>();
		for(int index=0;index<al.size();index++)
		{
			if(index!=al.lastIndexOf(al.get(index)))
				newAl.add(al.get(index));
		}
		return newAl;
	}
	
	void getDuplicateUsingSet(Integer[] arr)
	{
		Set<Integer> set=new HashSet<Integer>();
		System.out.print("Duplicates Using set are ");
		for(Integer i :arr)
		{
			if(!set.add(i))
				System.out.print(i+" ");
		}
	}
	
	void getDuplicatesUsingMap(Integer[] arr)
	{
		System.out.println();
		System.out.print("Duplicates using Map are ");
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer a:arr)
		{
			if(map.containsKey(a))
				map.put(a,map.get(a)+1);
			else
				map.put(a, 1);
		}
		for(Integer i:map.keySet())
		{
			if(map.get(i)>1)
				System.out.print(i+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,101,3,4,4,7};
		System.out.println("Without using collection->Duplicates are "+new Program11().findDuplicateUsingArray(arr));
		Integer[] arr1= {1,1,2,2,101,3,4,4,7};
		System.out.println("Using ArrayList->Duplicates are "+new Program11().getDuplicatesUsingList(arr1));	
		new Program11().getDuplicateUsingSet(arr1);
		new Program11().getDuplicatesUsingMap(arr1);
	}
}
