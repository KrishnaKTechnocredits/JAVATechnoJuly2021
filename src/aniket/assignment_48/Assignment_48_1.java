package aniket.assignment_48;

public class Assignment_48_1 {
	public static void main(String[] args) {
		GenerateAdharCard user1 = new GenerateAdharCard("FFPKOTB2233");
		GenerateAdharCard user2 = new GenerateAdharCard("FFPKOTB2233");
		GenerateAdharCard user3 = new GenerateAdharCard("DFPKOTB2233");
		System.out.println("Aadhar number for user1 is :"+user1.getAadharNumber());
		System.out.println("Aadhar number for user2 is :"+user2.getAadharNumber());
		System.out.println("Aadhar number for user3 is :"+user3.getAadharNumber());
	}
}
