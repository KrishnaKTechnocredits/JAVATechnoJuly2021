//Program 1: Create a system to generate AadharNumber with rules discussed in class.

package astha.Assignment48;

import java.util.HashMap;
import java.util.Map;

public class Program1 {

	static Map<String, String> aadharInfoMap = new HashMap<String, String>();
	static int count = 1;
	
	String generateAadhar(String pancard) {
		if(!aadharInfoMap.containsKey(pancard))
			aadharInfoMap.put(pancard, pancard+count++);
		return aadharInfoMap.get(pancard);
	}
	
	public static void main(String[] args) {
		Program1 user1 = new Program1();
		Program1 user2 = new Program1();
		Program1 user3 = new Program1();
		System.out.println(user1.generateAadhar("NFMOO5581K"));
		System.out.println(user2.generateAadhar("CSFHH1123K"));
		System.out.println(user3.generateAadhar("NFMOO5581K"));
	}
}
