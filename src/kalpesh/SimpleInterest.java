package kalpesh;

public class SimpleInterest {
	int si;

	void calculateInterest(int P, int T, int R) {
		int si2 = (P * T * R) / 100;
		si = si2;
	}

	void convertTemperature(int fahrenheit) {
		int celcius = (fahrenheit - 32) * 5 /(9);
		System.out.println("Temperature conversion is " + celcius);

	}

	void displayInfo() {
		System.out.println("The Simple Interest Calculated is - " + si);

	}

	public static void main(String[] args) {
		SimpleInterest simpleinterest = new SimpleInterest();
		simpleinterest.calculateInterest(10000, 3, 8);
		simpleinterest.displayInfo();
		simpleinterest.convertTemperature(102);

	}

}
