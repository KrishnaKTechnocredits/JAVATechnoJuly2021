/*Assignment - 44 : 1st Oct'2021
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99
 
Practice Program : remove all occurrences of Amruta
input : ["Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"]
output :  ["Techno","Chandni","Parthav", "Mayur","Credits"]
*/

package harshada.Assignment41_47;

import java.util.ArrayList;
import java.util.HashSet;

public class Assignment_44 {
	
	
	void p1_getMaxNumber() {
		
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(7);
		list.add(99);
		list.add(53);
		list.add(74);
		
		int maxNum=0;
		
		 /* for(int index=0; index < list.size() ; index++) {
			
			if( list.get(index) > maxNum) {
				maxNum = list.get(index);			
			}
		}
		*/
		
		for(Integer num : list ) {
			
			if(num> maxNum) {
				maxNum=num;
			}
		}
		System.out.println("Array List Elements are : " + list);
		System.out.println("Maximum number is = "+maxNum);
		
	}

	
	void p2_removeOccuranceOfString() {
		ArrayList<String> list=new ArrayList();
		//{"Techno","Chandni","Amruta","Parthav", "Mayur","Amruta","Credits","Amruta"} ;
		list.add("Techno");
		list.add("Chandni");
		list.add("Amruta");
		list.add("Parthav");
		list.add("Mayur");
		list.add("Amruta");
		list.add("Credits");
		list.add("Amruta");
		
		for(int i=0; i< list.size(); i++) {
			if(list.contains("Amruta")){
				list.remove("Amruta");
			}
		}
		System.out.println("Array List after removing all occurance of  'Amruta' : ");
		System.out.println(list);
		
		// Approach 2: pass it into SET , SET contains only unique values and after that delete that only occurance of amruta --> both will work
		 //HashSet<String> hs=new HashSet(list);
		 //if(hs.contains("Amruta")) {
			// hs.remove("Amruta");
		//}
		
		//System.out.println(hs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_44 assignment_44=new Assignment_44();
		assignment_44.p1_getMaxNumber();
		System.out.println("******************");
		assignment_44.p2_removeOccuranceOfString();
	}

}
