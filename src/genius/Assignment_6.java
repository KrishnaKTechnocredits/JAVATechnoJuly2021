package genius;

public class Assignment_6 {
	
	void calculateSimpleInterest(int principleAmount, int year, int rate) {
		int simpleInterest = (principleAmount * year * rate)/100;
		System.out.println("Simple Interest is "+simpleInterest);
	}
	
	void convertFahrenheitToCelsius(int fahrenhit) {
		float celsius = (fahrenhit - 32) * 5 / 9;
		System.out.println("Temperature in Celsius is "+celsius);
	}			

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.calculateSimpleInterest(50000,2,6);
		assignment_6.convertFahrenheitToCelsius(108);
    }

}
