package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example23 {

	public static void main(String[] args) {
		String[] arr = {"Neha", "Bhagyashree", "Bhakti","Swati","Neha","Neha"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(al);
		LinkedHashSet<String> nameSet = new LinkedHashSet<>(al);
		System.out.println(nameSet);
	}
}
