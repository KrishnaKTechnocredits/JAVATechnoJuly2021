package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Remove the longest string from given Set

public class RemoveLongestStringFromGivenSet {
	
	void getLongestString(ArrayList<String> str) {
		HashSet<String> set=new HashSet<>(str);
		String longestSize = "";
		for(int index=0;index < str.size();index++) {
			if(str.get(index).length() > longestSize.length()) {
				longestSize = str.get(index);
			}
		}
		str.remove(longestSize);
		System.out.println(str);
	}
	public static void main(String[] args) {
		RemoveLongestStringFromGivenSet removeLongestStringFromGivenSet=new RemoveLongestStringFromGivenSet(); 
		String [] str= {"Chirag","Prajapati","Good","Morning","Hi"};
		 ArrayList<String> al=new ArrayList<>(Arrays.asList(str));
		 removeLongestStringFromGivenSet.getLongestString(al);
	}
}
