package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		String[] arr = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Amruta");
		al1.add("Akanksha");
		
		al.removeAll(al1);
		System.out.println(al);
	}
}
