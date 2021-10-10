package technocredits1.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Example5 {

	List<String> getFilterNames(String[] names){
		//List<String> list= Arrays.asList(names);
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> filterNamesList = new ArrayList<String>();
		for(String name : al){
			if(name.startsWith("A") && name.length() >6)
				if(!filterNamesList.contains(name))
					filterNamesList.add(name);
		}
		return filterNamesList;
	}
	
	List<String> getFilterNames1(String[] names){
		ArrayList<String> filterNamesList = new ArrayList<String>();
		for(String name : names){
			if(name.startsWith("A") && name.length() >6)
				if(!filterNamesList.contains(name))
					filterNamesList.add(name);
		}
		return filterNamesList;
	}
	
	public static void main(String[] args) {
		String[] arr = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		
	}
}
