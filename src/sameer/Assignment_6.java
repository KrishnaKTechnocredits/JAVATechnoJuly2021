package sameer;

public class Assignment_6 {
	void simpleInterest(int P, double T, double R) {
		double simpleInterest = (P*T*R)/100;
		System.out.println("Simple Interset Is :" + simpleInterest);
	}
	
	void fahrenheitToCelsius(double fahrenheit ) {
		double Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println ("Fahreheit TO Celsius Conversion Is :" + Celsius);
	}
	
	public static void main (String [] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(102,25.25,12.25);
		assignment_6.fahrenheitToCelsius(38.5);
		
		
	}
}
