package neha.assignment_6;

public class CalculatorAssignment6 {

	void simpleIneterestCalculator(long principle, int time, float rate) {
		double simpleInterest;
		simpleInterest = (double) ((principle * time * rate) / 100);
		System.out.println("Simple interest is Rs." + simpleInterest);
	}

	void temperatureConveter(float fahrenheit) {
		float celsius;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celsius is " + celsius + " degree celsius");
	}

	public static void main(String[] args) {
		CalculatorAssignment6 calculatorAssignment6 = new CalculatorAssignment6();
		long principle = 2000000;
		int time = 10;
		float rate = 7.72f;
		float fahrenheit = 103.3f;
		calculatorAssignment6.simpleIneterestCalculator(principle, time, rate);
		calculatorAssignment6.temperatureConveter(fahrenheit);
	}

}
