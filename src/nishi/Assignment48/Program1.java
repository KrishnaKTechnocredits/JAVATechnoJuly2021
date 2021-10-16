/*Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
package nishi.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program1 {
	private static Map<String,String> map=new HashMap<String,String>();
	String panCard;
	Program1(String panCard)
	{
		this.panCard=panCard;
	}
	
	String getAdharNumber()
	{
		
		if(!map.containsKey(panCard))
			map.put(panCard, panCard+1);
		return map.get(panCard);
		
	}
	
	public static void main(String[] args) {
		Program1 pg1=new Program1("BTWPN1321C");
		Program1 pg2=new Program1("BTWPN1322C");
		Program1 pg3=new Program1("BTWPN1323C");
		System.out.println("Adhar_No is for user1 "+pg1.getAdharNumber());
		System.out.println("Adhar_No is for user2 "+pg2.getAdharNumber());
		System.out.println("Adhar_No is for user3 "+pg3.getAdharNumber());
		
	}
}
