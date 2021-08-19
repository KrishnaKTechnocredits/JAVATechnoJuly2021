package chandni_bhojwni;


public class Assignment_6 {
		
		
	
	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6 ();
		assignment_6.simpleInterest(3500, 3 , 6.8f);
		assignment_6.convertTemperature(45);
		
	}
	void simpleInterest (int principle, double time, double rate) {
		double simpleInterest = (principle*time*rate)/100;
		System.out.println ("Simple Interest is " + simpleInterest );
		
	}

	void convertTemperature (float farenheit) {
		float celsius = (farenheit - 32) * 5/9;
		System.out.println ("Temperature in celsius is " + celsius);

				
	}
}
