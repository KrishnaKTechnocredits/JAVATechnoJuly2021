package apurva;

public class Assignment_6 {
	
	void simpleInterest(float principle, float time, float rate) {
		float simple_Interest = (principle*time*rate)/100;
		System.out.println("Simple interest calculated is: " +simple_Interest);			
	}
	
	void tempreature(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Conversion of fahrenheit to celsius is: " +celsius);
	}
	
	public static void main(String[] a) {
		Assignment_6 assign = new Assignment_6();
		assign.simpleInterest(20,4,5);
		assign.tempreature(55);
	}

}
