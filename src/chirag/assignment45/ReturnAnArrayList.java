package chirag.assignment45;

/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnAnArrayList {
	
	ArrayList<String> getArrayList(ArrayList<String> name){
		ArrayList<String> al2=new ArrayList<>();
		for(int index = 0 ; index < name.size();index++) {
			if(name.get(index).contains("A") && name.get(index).length() > 6) {
				if(!al2.contains(name.get(index)))
				al2.add(name.get(index));
			}
		}
		return al2;
	}
	public static void main(String[] args) {
		ReturnAnArrayList returnAnArrayList=new ReturnAnArrayList();
		String [] arr = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav",
				"Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		List<String> list=Arrays.asList(arr);
		ArrayList<String> al=new ArrayList<>(list);
		System.out.println(returnAnArrayList.getArrayList(al));
	}
}