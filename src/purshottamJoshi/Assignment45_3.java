/*program 3: print index of all occurances of Akanksha.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"]
output : 1
         4*/

package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_3 {
	
	public static void main(String[] args) {
		String[] input = {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(input));
		
		for(int index=0; index< al.size(); index++) {
			if(al.get(index).contains("Akanksha")) {
				System.out.println(index);
				
			}
		}
		
	}

}
