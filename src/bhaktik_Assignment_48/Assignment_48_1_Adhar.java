/*Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.

Program 2 : Find how many pairs of socks we can have from given array.
input : [10,3,10,4,7,4,10,3,2,7]
output : 4 pairs
Hint : Map*/

package bhaktik_Assignment_48;

import java.util.HashMap;

public class Assignment_48_1_Adhar {
	static String pan;
	static int count =1;
	static HashMap<String, String> padAdharMap= new HashMap ();
	
	Assignment_48_1_Adhar(String pan){
		this.pan=pan;
	}
	 
	String getAdharNum(String pan) {
		if(!padAdharMap.containsKey(pan)) {
			padAdharMap.put(pan, pan+count++); 
			return padAdharMap.get(pan);
		}	
		else {
			return padAdharMap.get(pan);
		}
			
	 
	}
	
	
}
