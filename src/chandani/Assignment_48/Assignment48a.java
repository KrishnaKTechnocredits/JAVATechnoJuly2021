//Program 1: Create a system to generate AadharNumber with rules discussed in class.

package chandani.Assignment_48;

import java.util.HashMap;
import java.util.Map;

public class Assignment48a {

	static Map<String, String> aadharInfoMap = new HashMap<String, String>();
	static int count = 1;

	String generateAadhar(String pancard) {
		if(!aadharInfoMap.containsKey(pancard))
			aadharInfoMap.put(pancard, pancard+count++);
		return aadharInfoMap.get(pancard);
	}

	public static void main(String[] args) {
		Assignment48a user1 = new Assignment48a();
		Assignment48a user2 = new Assignment48a();
		Assignment48a user3 = new Assignment48a();
		System.out.println(user1.generateAadhar("NFMOO5581K"));
		System.out.println(user2.generateAadhar("CSFHH1123K"));
		System.out.println(user3.generateAadhar("NFMOO5581K"));
	}
}