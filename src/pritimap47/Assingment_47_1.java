package pritimap47;

import java.util.HashMap;

public class Assingment_47_1 {
	HashMap<Character, Integer> getFreqOfString(String str){
		HashMap<Character, Integer> hmap= new HashMap<>();
		int count=0;
		for (int index=0;index<str.length();index++) {
		char ch = str.charAt(index);
		if(hmap.containsKey(ch)){
			count= hmap.get(ch);
			hmap.put(ch, ++count);
		}
		else 
			hmap.put(ch, 1);
		}
		//System.out.println(hmap);
		return hmap;
	}
	
	public static void main(String[] a) {
		String str= "varsha";
		Assingment_47_1 assingment_47_1= new Assingment_47_1();
		System.out.println("Frequency of each character in the string: varsha :");
		System.out.println(assingment_47_1.getFreqOfString(str));
	}

}
/*Program 1: find frequency of each char from string
i/p : "varsha"
o/p : v = 1
	  a = 2
	  r = 1
	  s = 1
	  h = 1*/
