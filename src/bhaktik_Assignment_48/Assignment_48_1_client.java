package bhaktik_Assignment_48;

public class Assignment_48_1_client {
	
	public static void main(String[] args) {
		Assignment_48_1_Adhar u1= new Assignment_48_1_Adhar("BKP100");
		String adharCard=u1.getAdharNum("BKP102");
		String adharCard1=u1.getAdharNum("BKP103");
		String adharCard11=u1.getAdharNum("BKP104");
		System.out.println(Assignment_48_1_Adhar.padAdharMap);
	}
}
