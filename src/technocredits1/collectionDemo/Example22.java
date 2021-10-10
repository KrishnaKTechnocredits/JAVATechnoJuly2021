package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Example22 {

	public static void main(String[] args) {
		String[] arr = {"Neha", "Bhagyashree", "Bhakti","Swati","Neha","Neha"};
		
		TreeSet<String> nameSet = new TreeSet<String>(Arrays.asList(arr));
		ArrayList<String> al = new ArrayList<String>(nameSet);
		
		System.out.println("first : " + al.get(0));
		System.out.println("last :" + al.get(al.size()-1));
		System.out.println(nameSet);
	}
}
