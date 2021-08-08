package sagar_Anasane;

public class Assignment_6 {
	void computeSimpleInterest(int principleAmount, int time , float rate){
		float Simple_Interest = (principleAmount * time * rate)/100 ;
		
		System.out.println("Simple Interest = " + Simple_Interest);
	
	}
	
	void fahrenhitToCelcius(int fahrenhit) {
		float Celsious = (fahrenhit - 32) * 5 / 9;
		System.out.println("Temperature from Farenhite to Celcious = " + Celsious);
	}
	
	public static void main (String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6 . computeSimpleInterest(25000,7,7.2f);
		assignment_6 . fahrenhitToCelcius(64);
	}
}
