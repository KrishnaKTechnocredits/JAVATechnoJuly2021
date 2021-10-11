package technocredits1.collectionDemo;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Shalaka");
		listOfNames.add("Vivek");
		listOfNames.add("Sagar");
		
		System.out.println(listOfNames.size());
		//System.out.println(listOfNames);
		
		for(int index=0;index<listOfNames.size();index++) {
			String name = listOfNames.get(index);
			if(name.startsWith("S") && name.length() > 5)
				System.out.println(index + ":" + name);
		}
		
		int index=0;
		for(String name : listOfNames) {
			if(name.startsWith("S") && name.length() > 5)
				System.out.println(index + ":" + name);
			index++;
		}
		
		
	}
}
