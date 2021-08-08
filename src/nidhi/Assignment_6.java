package nidhi;

public class Assignment_6 {
		int simpleInt;
		int cel;
	void simpleInterest(int p, int t, int r) {
		simpleInt = (p * r * t)/100;
		System.out.println(simpleInt);
	}
	
	void fahrenheitToCelsius(int f) {
		cel = (f - 32) * 5 / 9;
		System.out.println(cel);
	}
	public static void main(String[] args) {
		Assignment_6 assignment = new Assignment_6();
		assignment.simpleInterest(1000, 2, 5);
		assignment.fahrenheitToCelsius(80);
	}
}
