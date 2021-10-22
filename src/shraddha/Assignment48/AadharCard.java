/*Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.
*/
package shraddha.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class AadharCard {
	String aadharCard;
	static Map<String,String> map = new HashMap<String,String>();
	
	AadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public static void main(String[] args) {
		AadharCard obj1 = new AadharCard("MHR78956AK");
		AadharCard obj2 = new AadharCard("NDH71216RB");
		AadharCard obj3 = new AadharCard("PNA34656GH");
		AadharCard obj4 = new AadharCard("TNK37812NR");
		System.out.println(obj1.getAdhaarNumber());
		System.out.println(obj2.getAdhaarNumber());
		System.out.println(obj3.getAdhaarNumber());
		System.out.println(obj4.getAdhaarNumber());
	}

	String getAdhaarNumber(){
	if(!map.containsKey(aadharCard))
		map.put(aadharCard,aadharCard+1);
	return map.get(aadharCard);
	}
}
