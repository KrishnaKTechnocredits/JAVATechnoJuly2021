/*program 4 : return an ArrayList which contains name starts with A and having length more than 6 chars.
input : ["Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"]		 
output : [Akanksha, AparnaTiwari]*/

package purshottamJoshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment45_4 {

	public static void main(String[] args) {
		String[] str= {"Techno","Akanksha","Mayur","Chandni","Akanksha","Amruta","Chandni","Parthav", "Mayur","Amruta","Credits","Amruta", "AparnaTiwari"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(str));
		
		for(int index=0; index < al.size(); index++) {
			if(al.get(index).startsWith("A") && al.get(index).length() >6) {
				System.out.println(al.get(index));
			}
		}
	}
}
