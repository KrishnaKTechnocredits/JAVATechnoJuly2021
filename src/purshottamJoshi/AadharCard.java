/*Assignment - 48 : 9th Oct'2021

Program 1: Create a system to generate AadharNumber with rules discussed in class.*/
package purshottamJoshi;
import java.util.HashMap;
import java.util.Map;

public class AadharCard {
	
	String panNumber;
	static Map<String, String> map = new HashMap<String, String>();

	public AadharCard(String panNumber) {
			this.panNumber = panNumber;
	}

	String getAadharNumber() {
		if (!map.containsKey(panNumber)) {
				map.put(panNumber, panNumber + 1);
		}
		return map.get(panNumber);
	}
	
	public static void main(String[] args) {
		
		System.out.println(new AadharCard("MFKP9871F").getAadharNumber());
	}

}
