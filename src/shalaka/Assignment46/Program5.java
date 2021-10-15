/*
Example 5 :
Remove the longest string from given Set.*/
package shalaka.Assignment46;

import java.util.HashSet;
import java.util.Iterator;

public class Program5 {
	void removeLongestString(HashSet<String> str) {
		System.out.println(str);
		String temp = "";
		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			String input = itr.next();
			if (input.length() > temp.length()) {
				temp = input;
			}
		}
		str.remove(temp);
		System.out.println("After removing longest String from set output is:" + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Shalaka");
		set.add("Shweta");
		set.add("Shashank");
		set.add("Shayam");
		set.add("Dharmadhikari");
		set.add("Mayur");
		Program5 program5 = new Program5();
		program5.removeLongestString(set);
	}

}
