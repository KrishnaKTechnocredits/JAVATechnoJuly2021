//Program 1: Create a system to generate AadharNumber with rules discussed in class.

package harshada.Assignment48;

import java.util.HashMap;
import java.util.Map;

import shalaka.Assignment48.AadharNumber;

public class P1_AadharCard {

	String panNumber;
	static Map<String, String> map = new HashMap<String, String>();

	P1_AadharCard(String panNumber) {
		this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber)) {
			map.put(panNumber, panNumber + 1);
		}
		return panNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1_AadharCard aadharNumber = new P1_AadharCard("ABCD234F");
		System.out.println(aadharNumber.getAadharNumber());
	}
}
