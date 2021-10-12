package pritiCollction;

import java.util.ArrayList;
import java.util.Arrays;

public class Assingment_45_2 {
	ArrayList<String> eleFreqMorethanone(String[] name){
		
		ArrayList<String> list =new ArrayList<String>(Arrays.asList(name));
		ArrayList<String> filternamelist =new ArrayList<String>();
		for (String names:name) {
			if (list.indexOf(names)!=list.lastIndexOf(names)) {
				if (!(filternamelist.contains(names)))
				filternamelist.add(names);
			}
		}
		return filternamelist;
	}
	
	ArrayList<String> eleFreqMorethanone1(String[] name){
		
		ArrayList<String> list =new ArrayList<String>(Arrays.asList(name));
		ArrayList<String> filternamelist =new ArrayList<String>();
		for (int index=0; index<list.size();index++) {
			String names = list.get(index);
			if (list.indexOf(names)!=list.lastIndexOf(names)) {
				//if (!(filternamelist.contains(names)))
				if (index==list.indexOf(names))
				filternamelist.add(names);
			}
		}
		return filternamelist;
	}
	
	
	public static void main(String[] a){
		Assingment_45_2 assingment_45_2 = new Assingment_45_2();
		String[] input = {"Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String>list=assingment_45_2.eleFreqMorethanone(input);
		System.out.println("First approach : using enhance forloop");
		System.out.println("Duplicates in arraylist :"+list);
		ArrayList<String>list1=assingment_45_2.eleFreqMorethanone1(input);
		System.out.println("-----------------------------------------------------");
		System.out.println("Second approach : using forloop");
		System.out.println("Duplicates in arraylist :"+list1);
	}
}

/*Program 2: print duplicates in arraylist [print all the elements having freq more than 1]
input : ["Techno","Mayur","Chandni","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : ["Mayur","Chandni","Amruta"]*/

