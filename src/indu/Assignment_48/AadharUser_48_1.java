package indu.Assignment_48;

public class AadharUser_48_1 {

	public static void main(String[] args) {
		GenerateAadharCard user1 = new GenerateAadharCard("FFPKOTB2233");
		GenerateAadharCard user2 = new GenerateAadharCard("FFPKOTB2233");
		GenerateAadharCard user3 = new GenerateAadharCard("DFPKOTB2233");
		System.out.println("Aadhar number for user1 is :"+user1.getAadharNumber());
		System.out.println("Aadhar number for user2 is :"+user2.getAadharNumber());
		System.out.println("Aadhar number for user3 is :"+user3.getAadharNumber());
	}
}
