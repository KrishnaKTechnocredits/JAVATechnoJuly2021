package chirag.assignment45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

public class PrintIndexOfAllOccurancesOfWord {
	
	public static void main(String[] args) {
		
		String [] arr = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		List<String> list = Arrays.asList(arr);
		ArrayList<String> al=new ArrayList<>(list);
		for(int index = 0 ; index < al.size() ; index++) {
			if(al.get(index).equals("Akanksha"))
				System.out.println(index);
		}	
	}
}