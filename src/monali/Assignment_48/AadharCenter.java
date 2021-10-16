package monali.Assignment_48;

import java.util.HashMap;

public class AadharCenter {

	private static HashMap<String, String> map = new HashMap<String, String>();
	static int count = 0;
	String panCard;

	AadharCenter(String panCard) {
		this.panCard = panCard;
	}

	String getAadharinfo(String panCard) {
		if (!map.containsKey(panCard))
			map.put(panCard, panCard + count++);
		return map.get(panCard);
	}

	public static void main(String[] args) {
		AadharCenter aadhar = new AadharCenter("BBRPB6659L");
		System.out.println(aadhar.getAadharinfo("BBRPB6659L"));
		aadhar = new AadharCenter("CCRPC6659L");
		System.out.println(aadhar.getAadharinfo("CCRPC6659L"));
		aadhar = new AadharCenter("BBRPB6659L");
		System.out.println(aadhar.getAadharinfo("BBRPB6659L")); // same

		aadhar = new AadharCenter("DBRPB6659L");
		System.out.println(aadhar.getAadharinfo("DBRPB6659L"));

	}
}
