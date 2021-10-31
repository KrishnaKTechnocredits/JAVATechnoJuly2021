package precilla.assignment48;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/*program 11 : find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program11 {
	public static void main(String[] args) {
		//Option 1 : without Collection -> Array & loop inside loop
		System.out.println("Without collection");
		int[] a= {10,20,50,60,10,4,20,60,10,60,10};
		System.out.println("input : "+Arrays.toString(a));
		int cnt=0;
		System.out.print("output : ");
		for(int index=0;index<a.length;index++) {
			for(int index1=index+1;index1<a.length;index1++) {
				if(a[index]==a[index1])
					cnt++;
			}
			if(cnt==1)
				System.out.print(a[index]+ " ");
			cnt=0;
		}
		//Option 3 : Set : boolean add()
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		System.out.println("\n\nUsing set \ninput :"+hs);
		System.out.println("Duplicate ? "+hs.add(10));
		System.out.println("Duplicate ? "+hs.add(30));
		
		Integer[] array= {1,2,3,2,5,3,7,3,9};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(array));
		ArrayList<Integer> dup=new ArrayList<Integer>();
		for(int index=0;index<al.size();index++)
		{
		    if(al.indexOf(al.get(index))!=al.lastIndexOf(al.get(index)))
		    {
		        if(!dup.contains(al.get(index)))
		        {
		            dup.add(al.get(index));
		        }
		    }
		}
		System.out.println("\nUsing arraylist");     
		System.out.println("input : "+al);
		System.out.println("Duplicates : "+dup);
		
		//Option 4 : Map : value gr8 than 1.*/
		System.out.println("\nUsing hashmap");
		System.out.println("input "+al);
		HashMap<Integer, Integer> hm=new LinkedHashMap<Integer,Integer>();
		int count=0;
		for(Integer word:al) {
			if(!hm.containsKey(word)) {
				hm.put(word, 1);
			}
			else {
				count=hm.get(word)+1;
				hm.put(word, count);
			}
		}
		System.out.print("Output : ");
		Set<Entry<Integer,Integer>> hset=hm.entrySet();
		Iterator<Entry<Integer,Integer>> itr=hset.iterator();
		while(itr.hasNext()) {
			Entry<Integer,Integer> entry=itr.next();
			if(entry.getValue()>1)
				System.out.print(entry.getKey()+" ");
		}
		
		
	}

}
