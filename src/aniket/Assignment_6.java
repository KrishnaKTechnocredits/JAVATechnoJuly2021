package aniket;

public class Assignment_6 {
	
	void simpleIntrest(float principle,float time,float rate) {
		float simpleIntrest = principle*time*rate;
		System.out.println("Simple intrest is "+simpleIntrest);
		
	}
	
	void converttemp(float fahrenheit) {
		
		float celsius=(fahrenheit-32)*5/9;
		System.out.println("Converted temp in celcius is "+celsius);
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleIntrest(500.0f, 12.5f, 100.23f);
		assignment_6.converttemp(70.5f);

	}

}
