package chirag.assignment46;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//Write a program to traverse(or iterate) HashSet

public class IterateHashSet {
	
	public static void main(String[] args) {
		String [] str= {"Chirag","Rahul","Rajat","Aadarsh","Kunal"};
		HashSet<String> set=new HashSet<>(Arrays.asList(str));
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
