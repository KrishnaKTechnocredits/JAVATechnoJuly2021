package arti_G;

//Assignment6
public class Assignment_6 {

	int p;
	int t;
	int r;
	float f;
	int SimpleInterest;
	float Celsius;

	void simpleInterest(int principal, int time, int rate) {
		p = principal;
		t = time;
		r = rate;
		SimpleInterest = (p * t * r) / 100;
		System.out.println("SimpleInterest = " + SimpleInterest);
	}

	void convertCelsiusToFahrenheit(float fahrenheit) {
		f = fahrenheit;
		Celsius = (f - 32) * 5 / 9;
		System.out.println("Temperature from fahrenheit to celsius = " + Celsius);
		int simpleInterest;
		simpleInterest = (p * t * r) / 100;
		System.out.println("SimpleInterest = " + simpleInterest);
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest(5000, 1, 15);
		assignment_6.convertCelsiusToFahrenheit(54);
	}
}
