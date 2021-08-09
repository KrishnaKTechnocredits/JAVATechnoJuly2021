package monali;

/*Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9*/
public class Assignment_6 {

	float smplInterest;
	float celsius;

	void calculateSimpleInterest(float principle, float time, float rate) {
		smplInterest = (principle * time * rate) / 100;
	}

	void convertTempFahrenToCel(float fahrenheit) {
		celsius = ((fahrenheit - 32) * 5) / 9;
	}

	void displayResult() {
		System.out.println("Calculated Simple Interest value ==> " + smplInterest);
		System.out.println("Temperature in Celsius is==> " + celsius);
	}

	public static void main(String[] args) {
		Assignment_6 SmplInterest_tempCelFahren = new Assignment_6();
		SmplInterest_tempCelFahren.calculateSimpleInterest(3000f, 5f, 10.55f);
		SmplInterest_tempCelFahren.convertTempFahrenToCel(35f);
		SmplInterest_tempCelFahren.displayResult();
	}
}
