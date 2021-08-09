package umakant;

public class Assignment_6 {
	
	void interestCalculation(int principal,int time, int rate) {
		float interest = principal*time*rate/100;
		System.out.println("Simple interest is " + interest);
	}
	
	void temperatureConversion(float fahrenheitTemperature) {
		float celsiusTemperature = (fahrenheitTemperature-32)*5/9;
		System.out.println("Temperature in Celsius is " + celsiusTemperature);
	}
	
	public static void main(String args[]) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.interestCalculation(5432, 12, 6);
		assignment_6.temperatureConversion(98.5f);
	}
}
