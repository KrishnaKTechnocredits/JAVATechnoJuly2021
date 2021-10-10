package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shalaka");
		listOfNames.add("vivek");
		listOfNames.add("Sagar");
		listOfNames.add("vivek");
		
		System.out.println(listOfNames);
		listOfNames.add(listOfNames.size(), "Gaurav");
		System.out.println(listOfNames);
		
		String deletedElement = listOfNames.remove(3);
		System.out.println(deletedElement + "---" + listOfNames);
		boolean flag = listOfNames.remove("Sagar");
		System.out.println("Flag : " + flag);
		System.out.println(listOfNames);
		
		listOfNames.clear();
		System.out.println(listOfNames); // []
	}
}
