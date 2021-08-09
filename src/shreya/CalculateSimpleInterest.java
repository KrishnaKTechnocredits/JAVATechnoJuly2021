package shreya;

public class CalculateSimpleInterest {
	void simpleInterest(double principle, double time, double rate) {
		double si = principle * rate * time / 100;
		System.out.println("-----Program To Calculate Simple Interest-----");
		System.out.println("Principle amount is " + principle);
		System.out.println("Time is " + rate);
		System.out.println("Rate is " + time);
		System.out.println("Simple Interest is  " + si);
	}

	void temperature(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("-----Program To Convert Temperature From Fahrenheit To Celcius Degree-----");
		System.out.println("Temperature in fahrenheit is " + fahrenheit);
		System.out.println("Temperature in celcius is " + celsius);
	}

	public static void main(String[] args) {
		CalculateSimpleInterest calculateSi = new CalculateSimpleInterest();
		calculateSi.simpleInterest(20000, 2, 10);
		calculateSi.temperature(195);

	}

}
