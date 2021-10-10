package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shalaka");
		listOfNames.add("vivek");
		listOfNames.add("Sagar");
		listOfNames.add("vivek");
		
		for(String name : listOfNames) {
			if(name.startsWith("S") && name.length() > 5) {
				System.out.println(name);
				int index = listOfNames.indexOf(name);
				System.out.println(index);
			}
		}
		
		if(listOfNames.contains("Vivek"))
			System.out.println(listOfNames.lastIndexOf("Vivek"));
		else
			System.out.println("Vivek is not present in the list");
	}
}
