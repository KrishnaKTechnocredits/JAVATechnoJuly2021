package gauravk.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
 * Programming Questions - Collections : 4th Oct'2021
 * 
Example 5 :
Remove the longest string from given Set.

 */
public class RemoveLongestString {
	
	void removeLongestStringUsingArrayList(String[] str) {
		ArrayList<String> arl = (ArrayList<String>)new ArrayList<>(Arrays.asList(str));
		ArrayList<String> arl2 = new ArrayList<>();
		String maxLength = arl.get(0);
		
		for(int i=0; i<arl.size()-1; i++) {
			if(maxLength.length()<arl.get(i+1).length()) {
				maxLength = arl.get(i+1);
			}
		}
		
		arl2.add(maxLength);
		arl.removeAll(arl2);
		System.out.println(arl);
	}
	
	void removeLonestStringUsingMap(String[] str) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		int strLength=0;
		String strTarget = "";
		for(int i=0; i<str.length; i++) {
			lhm.put(str[i], str[i].length());
			if(str[i].length()>strLength) {
				strTarget = str[i];
				strLength = str[i].length();
			}
		}
		System.out.println(lhm.remove(strTarget));
		System.out.println(lhm.keySet());
	}
	
	public static void main(String[] args) {
		String[] stringList = {"Hi","Hello","I","Java","Credits"};
		System.out.println("---------using ArrayList--------");
		new RemoveLongestString().removeLongestStringUsingArrayList(stringList);
		System.out.println("---------using Map--------");
		new RemoveLongestString().removeLonestStringUsingMap(stringList);
	}
}
