package pritiCollction;

import java.util.ArrayList;
import java.util.Arrays;

public class Assingment_45_3 {
	
	void getoccrancesOfduplcateElements(String [] names) {
		for(int index=0; index<names.length;index++) {
			if (names[index]== "Akanksha"){
			System.out.println("Index of Akanksha : " +index);
			}
		}	
	}
	
	/*void getoccrancesOfduplcateElements1(String [] names) {
		
		ArrayList<String> list= new ArrayList<>(Arrays.asList(names));
		for(int index=0; index<list.size();index++) {
			
		}	
	}*/
	
	
	public static void main(String[] a) {
		Assingment_45_3 assingment_45_3 = new Assingment_45_3();
		String [] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta",};
		assingment_45_3. getoccrancesOfduplcateElements(input);
		//assingment_45_3. getoccrancesOfduplcateElements1(input);
		
	}
	

}
/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/
