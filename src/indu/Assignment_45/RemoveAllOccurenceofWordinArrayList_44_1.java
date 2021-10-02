/*Program : remove all occurrences of Amruta
input : ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
output :  ["Techno","Chandni","Parthav", "Mayur","Credits"]*/
package indu.Assignment_45;

import java.util.ArrayList;

public class RemoveAllOccurenceofWordinArrayList_44_1 {
	static void removeSTring()
	{	
		ArrayList<String> listofName= new ArrayList<String>();
		listofName.add("Techno");
		listofName.add("Chandani");
		listofName.add("Amruta");
		listofName.add("Parthav");
		listofName.add("Mayur");
		listofName.add("Amruta");
		listofName.add("Credits");
		listofName.add("Amruta");
		
		System.out.println(listofName);
		while(listofName.contains("Amruta")) {
			listofName.remove("Amruta");
		}
		System.out.println(listofName);
	}
	public static void main(String[] args) {
		removeSTring();
		
	}
}
