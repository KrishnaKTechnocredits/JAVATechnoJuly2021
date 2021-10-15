package margi.Assignment_48.Assignment_48_1;

public class User {

	public static void main(String[] args) {
		AadharCenter user_1 = new AadharCenter();
		String aadharCardDoc = user_1.getAadharNumber("SN56DNA1LCNK");
		System.out.println(aadharCardDoc);
		user_1 = new AadharCenter();
		user_1.getAadharNumber("SN56DNA1LCNK");
		System.out.println(aadharCardDoc);
	}
}