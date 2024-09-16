package dattaraj;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment46_P5 {
	public static void main(String[] args) {
		Assignment46_P5 pgm5 = new Assignment46_P5();
		HashSet<String> nameList = new HashSet<String>();
		nameList.add("Dattaraj");
		nameList.add("Samiksha");
		nameList.add("Akanksha");
		nameList.add("technocredits");
		nameList.add("Rima");
		System.out.println("List before removing the longest string : " +nameList);
		pgm5.removeLongestString(nameList);
	
	}

	private void removeLongestString(HashSet<String> nameList) {
		// TODO Auto-generated method stub
		String longestString = "";
		Iterator<String> iterator = nameList.iterator();
		while(iterator.hasNext()){
			String input = iterator.next();
			if(input.length() > longestString.length())
				longestString = input;
		}
		nameList.remove(longestString);
		System.out.println(longestString + " : length = " +longestString.length() + " is removed from the list : " +nameList);
		
	}
}
