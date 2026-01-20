/*Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.
*/

package ritabrata.assignment48;

import java.util.HashMap;
import java.util.Map;

public class Assignment_48_1 {
	private static Map<String,String> map=new HashMap<String,String>();
	String panCard;
	Assignment_48_1(String panCard)
	{
		this.panCard=panCard;
	}
	
	String getAdhar()
	{
		if(!map.containsKey(panCard))
			map.put(panCard, panCard+1);
		return map.get(panCard);
	}

	public static void main(String[] args) {
		Assignment_48_1 aadhaar1 = new Assignment_48_1("ABCDE1234A");
		Assignment_48_1 aadhaar2 = new Assignment_48_1("ABCDE1234B");
		Assignment_48_1 aadhaar3 = new Assignment_48_1("ABCDE1234C");
		System.out.println("AADHAR no for user 1 is: "+aadhaar1.getAdhar());
		System.out.println("AADHAR no for user 2 is: "+aadhaar2.getAdhar());
		System.out.println("AADHAR no for user 3 is: "+aadhaar3.getAdhar());
	}
}
