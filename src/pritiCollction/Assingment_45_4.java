package pritiCollction;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class Assingment_45_4 {
	ArrayList<String> returnFilteredArraylist(String[] input){
	//List<String> list= Arrays.asList(input);
		ArrayList<String>al= new ArrayList<>(Arrays.asList(input));
		ArrayList<String> filtername = new ArrayList<String>();
		for (String name : al) {
			if (name.startsWith("A")&& name.length()>6) {
				if(!(filtername.add(name))) {
					filtername.add(name);
				}
			}
		}
		return filtername;
	}
	
	ArrayList<String> returnFilteredArraylist1(String[] input){
		ArrayList<String> filtername = new ArrayList<String>();
		for (String name: input) {
			if (name.startsWith("A")&& name.length()>6) {
				if (!(filtername.contains(name))) {
					filtername.add(name);
				}
			}
		}
		return filtername;
	}
	
	
	
	public static void main(String[] a) {
		Assingment_45_4 assingment_45_4 =new Assingment_45_4();
		String [] input= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		//ArrayList<String> list2= assingment_45_4.returnFilteredArraylist(input);
		//System.out.println(list2);
		ArrayList<String> list= assingment_45_4.returnFilteredArraylist1(input);
		System.out.println("Array after filtering the elements: "+ list);
		
	}
	
}
/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/